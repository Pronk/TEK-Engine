package com.tek.log;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Calendar;

public class Logger {

	String name;
	File output;
	boolean file_logging;
	PrintStream ps;

	/**
	 * Создает лог в папке "logs"
	 * 
	 * @param name
	 *            название файда
	 * @param enable_file_logging
	 *            "true" чтобы лог записывал инфо в файл
	 */
	public Logger(String name, boolean enable_file_logging) {
		file_logging = enable_file_logging;
		if (enable_file_logging) {
			String timestamp = "";
			Calendar c = Calendar.getInstance();
			timestamp += c.get(c.DATE) + "-" + c.get(c.MONTH) + "-"
					+ c.get(c.YEAR) + " " + timestamp(c,"-");
			File output = new File("logs" + File.separator + name + " "
					+ timestamp + ".txt");
			output.getParentFile().mkdirs();
			if (!output.exists()) {
				try {
					output.createNewFile();
					ps = new PrintStream(output);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// Добавляет строчку к логу
	public void addLine(String logline) {
		String timestamp = "";
		Calendar c = Calendar.getInstance();
		timestamp += timestamp(c,":");
		System.out.println("[" + timestamp + "] " + logline);
		if (file_logging) {
			ps.println("[" + timestamp + "] " + logline);
		}
	}

	private String timestamp(Calendar c, String delim) {
		return c.get(c.HOUR) + delim + c.get(c.MINUTE) + delim
				+ c.get(c.SECOND);
	}

	public void close() {
		ps.close();
	}
}
