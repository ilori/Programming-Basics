import java.util.Scanner;

public class p16_URLParser {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String url = console.nextLine().trim();
        String protocol = "";
        String server = "";
        String resource = "";

        int protocolIndex = url.indexOf("://");
        if (protocolIndex != -1) {
            protocol = url.substring(0, protocolIndex);
        }
        if (!protocol.equals("")) {
            url = url.substring(protocol.length() + 3, url.length());
        }
        int serverIndex = url.indexOf("/");
        if (serverIndex != -1) {
            server = url.substring(0, serverIndex);
        } else {
            server = url;
        }
        int resourceIndex = url.indexOf("/");
        if (resourceIndex != -1) {
            resource = url.substring(resourceIndex + 1, url.length());
        }
        System.out.printf("[protocol] = \"%s\"%n", protocol);
        System.out.printf("[server] = \"%s\"%n", server);
        System.out.printf("[resource] = \"%s\"", resource);

    }
}
