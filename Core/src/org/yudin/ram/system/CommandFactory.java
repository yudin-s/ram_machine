package org.yudin.ram.system;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.yudin.ram.inter.Command;
import org.yudin.ram.inter.CommandEnum;

public class CommandFactory {
	private static final String EQUAL_SYMBOL = "=";
	private static final String SPACES = "\\s";
	private static final String COMMENTS = "\\\\[\\s\\S]{1,}";
	private static final String EMPTY = "";
	private static final String NUMBER_LINE = "[0-9]{1,}\\.";
	public static final String REGEX = "[A-Z]{1,}[\\s]{1,}?=?[\\s]?{1,}?-?[0-9]{1,}";
	public static final Pattern PATTERN = Pattern.compile(REGEX);
	public static final String REGEX_LITERAL = "[A-Z]{1,}";
	public static final Pattern PATTERN_LITERAL = Pattern
			.compile(REGEX_LITERAL);

	public static Command create(String create) {
		create = clearString(create);
		Command result = null;
		boolean isCubicle;
		int val;
		CommandEnum commandE;
		Matcher matcher = PATTERN.matcher(create);
		if (matcher.find()) {
			String clearCommand = create.substring(matcher.start(),
					matcher.end());
			String value;
			String command;

			if (clearCommand.contains(EQUAL_SYMBOL)) {
				StringTokenizer tok = new StringTokenizer(clearCommand,
						EQUAL_SYMBOL);
				command = tok.nextToken();
				isCubicle = false;
				value = tok.nextToken();
			} else {
				Matcher parseLine = PATTERN_LITERAL.matcher(clearCommand);
				parseLine.find();
				isCubicle = true;
				command = clearCommand.substring(parseLine.start(),
						parseLine.end());
				value = clearCommand.substring(parseLine.end());
				val = Integer.parseInt(trim(value));
				commandE = selector(trim(command));
			}

			val = Integer.parseInt(trim(value));
			commandE = selector(trim(command));

			result = new Command(commandE, isCubicle, val);
		}
		return result;
	}

	private static CommandEnum selector(String val) {
		try {
			CommandEnum result = CommandEnum.valueOf(val);
			return result;
		} catch (Exception e) {
			throw new UnsupportedOperationException();
		}
	}

	private static String trim(String line) {
		return line.replaceAll(SPACES, EMPTY);
	}

	private static String clearString(String line) {
		String result = line.replaceAll(NUMBER_LINE, EMPTY);
		result.replaceAll(COMMENTS, EMPTY);
		return result;
	}
}
