public class Main {
    public static void main(String[] args) {
        URL.URLBuilder builder = new URL.URLBuilder();
        builder.protocol("https://").hostname("google.com");
        URL url = builder.build();
        System.out.println(url.getProtocol() + url.gethostname());
    }
}
