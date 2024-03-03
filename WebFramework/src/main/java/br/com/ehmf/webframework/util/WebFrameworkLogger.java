package br.com.ehmf.webframework.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WebFrameworkLogger {
	
	//cores:
	private static final String VERDE   = "\u001B[32m";
	private static final String AMARELO = "\u001B[33m";
	private static final String BRANCO  = "\u001B[37m";
	private static final String RESET   = "\u001B[0m";
	
	public static DateTimeFormatter WEBFRAMEWORKDATE = 
			DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	
	public static void showBanner() {
		System.out.println(AMARELO);
		System.out.println("____    __    ____  _______ .______    _______ .______          ___      .___  ___.  ___________    __    ____  ______   .______       __  ___ ");
		System.out.println("\\   \\  /  \\  /   / |   ____||   _  \\  |   ____||   _  \\        /   \\     |   \\/   | |   ____\\   \\  /  \\  /   / /  __  \\  |   _  \\     |  |/  / ");
		System.out.println(" \\   \\/    \\/   /  |  |__   |  |_)  | |  |__   |  |_)  |      /  ^  \\    |  \\  /  | |  |__   \\   \\/    \\/   / |  |  |  | |  |_)  |    |  '  /  ");
		System.out.println("  \\            /   |   __|  |   _  <  |   __|  |      /      /  /_\\  \\   |  |\\/|  | |   __|   \\            /  |  |  |  | |      /     |    <   ");
		System.out.println("   \\    /\\    /    |  |____ |  |_)  | |  |     |  |\\  \\----./  _____  \\  |  |  |  | |  |____   \\    /\\    /   |  `--'  | |  |\\  \\----.|  .  \\  Framework WEB");
		System.out.println("    \\__/  \\__/     |_______||______/  |__|     | _| `._____/__/     \\__\\ |__|  |__| |_______|   \\__/  \\__/     \\______/  | _| `._____||__|\\__\\ Capacitação Minsait 2024");
		System.out.println(RESET);
	}
	
	public static void log(String modulo, String mensagem) {
		String date = LocalDateTime.now().format(WEBFRAMEWORKDATE);
		System.out.printf(VERDE + "%15s " + AMARELO + "%-30s:" + 
						   BRANCO + "%s\n" + RESET, date, modulo, mensagem
				);
		
	}
	
}
