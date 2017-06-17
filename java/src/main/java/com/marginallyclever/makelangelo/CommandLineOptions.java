package com.marginallyclever.makelangelo;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Store command line options for use in the app
 *
 * @author Admin
 */
public class CommandLineOptions {

	private static final Set<String> args = new LinkedHashSet<>();

	static void setFromMain(String[] argv) {
		args.addAll(Arrays.asList(argv));
	}

	public static boolean hasOption(String option) {
		return args.contains(option);
	}

	public static String getOption(String option) {
		String search = "--" + option + "=";
		for (String arg : args) {
			if (arg.startsWith(search)) {
				return arg.substring(search.length());
			}
		}
		return null;
	}
}
