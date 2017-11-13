package bitcamp.java100.ch14.ex3;

import java.io.IOException;
import java.io.InputStream;

public class MyBufferdInputStream2 {
	
	InputStream worker;

	byte[] buf = new byte[8192];
	int len;
	int cursor;

	public MyBufferdInputStream2(InputStream worker) {
		this.worker =worker;

	}

	public int read() throws IOException {
		if (cursor < len) {
			len = worker.read(buf);
			if (len == -1)
				return -1;

		}

		return buf[cursor++] & 0x000000FF;
	}
}
