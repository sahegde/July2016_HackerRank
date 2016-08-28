package sampleProj;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.FilenameUtils;

public class pak {

	public static String removeExtensions(String fileName) {
		if (Character.isDigit(fileName.charAt(fileName.length() - 1))) {
			return fileName;
		}

		String baseName = FilenameUtils.getBaseName(fileName);

		if (baseName.equals(fileName)) {
			return baseName;
		}

		return removeExtensions(baseName);
	}

	public static void main(String[] args) {
		String agentBundleVersionProperty = "agent-win32-6.3.0";
		String str1 = "agent-6.3.0.zip";
		String str2 = "agent-6.3.0.tar.gz";
		
		String split[] = agentBundleVersionProperty.split("-");
		String splitWithoutVersion[] = Arrays.copyOfRange(split, 0, split.length - 1);

		String AGENT_VERSION_REGEX = "\\-\\d+\\.\\d+\\.+\\d+";
		String regexPattern = Pattern.quote("agent") + AGENT_VERSION_REGEX;
		Pattern bundleMatches = Pattern.compile(regexPattern, Pattern.CASE_INSENSITIVE);

		Matcher bundleMatcher = bundleMatches.matcher("agent-6.3.0");
		System.out.println("sandeep " + bundleMatcher.find());

		String inputString = "agent-6.3.0.tar.gz";
		String suffix = ".tar.gz";
		int strOffset = inputString.length() - suffix.length();
		System.out.println(inputString.regionMatches(true, strOffset, suffix, 0, suffix.length()));
		
		System.out.println(removeExtensions(str1));
		System.out.println(removeExtensions(str2));
	}
}
