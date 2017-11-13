package bitcamp.java100.ch14.ex3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyBufferdInputStream extends FileInputStream {

	byte[] buf = new byte[8192];
	int len;
	int cursor;

	public MyBufferdInputStream(String name) throws FileNotFoundException {

		super(name);

	}

	@Override
	public int read() throws IOException {
		if (cursor < len) {
			len = this.read(buf);
			if (len == -1)
				return -1;

		}

		return buf[cursor++] & 0x000000FF;
	}
}
