package labten;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class CopyDataThread implements Runnable {

	FileInputStream inputStream = null;
	FileOutputStream outputStream = null;
	FileChannel inChannel = null;
	FileChannel outChannel = null;

	// constructor
	public CopyDataThread(FileInputStream inputStream,
			FileOutputStream outputStream) {
		this.inputStream = inputStream;
		this.outputStream = outputStream;
	}

	@Override
	public void run() {
		// thread name
		String name = Thread.currentThread().getName();
		try {
			// assign channels
			inChannel = inputStream.getChannel();
			outChannel = outputStream.getChannel();

			// declare buffer size of 10 character
			ByteBuffer buffer = ByteBuffer.allocate(10);
			long ms1 = System.currentTimeMillis();

			// run until file ends
			while (true) {
				int count = inChannel.read(buffer);
				if (count == -1)
					break; // if file ends
				buffer.flip();
				outChannel.write(buffer); // write to copy file
				buffer.clear();
				System.out.println(name + " thread going for sleep");
				// sleep of 5 sec after every 10 character copied
				Thread.sleep(5000); 
			}
			long ms2 = System.currentTimeMillis();
			System.out.println("File Coped in " + (ms2 - ms1) + " ms");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			try {
				// close all streams and channel
				inputStream.close();
				outputStream.close();
				inChannel.close();
				outChannel.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
