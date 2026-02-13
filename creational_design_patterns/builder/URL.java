public class URL {

    public static class URLBuilder{
        private String protocol;
        private String hostname;
        private String port;
        private String pathParam;
        private String queryParam;

        public URLBuilder protocol(String protocol){
            this.protocol = protocol;
            return this;
        }

        public URLBuilder hostname(String hostname){
            this.hostname = hostname;
            return this;
        }

        public URLBuilder port(String port){
            this.port = port;
            return this;
        }

        public URLBuilder pathParam(String pathParam){
            this.pathParam = pathParam;
            return this;
        }

        public URLBuilder queryParam(String queryParam){
            this.queryParam = queryParam;
            return this;
        }

        public URL build(){
            return new URL(this);
        }
    }


    private String protocol;
    private String hostname;
    private String port;
    private String pathParam;
    private String queryParam;

    public URL(URLBuilder builder){
        this.protocol = builder.protocol;
        this.hostname = builder.hostname;
        this.port = builder.port;
        this.pathParam = builder.pathParam;
        this.queryParam = builder.queryParam;
    }

    public String getProtocol(){
        return protocol;
    }

    public String gethostname(){
        return hostname;
    }

    public String getPathParam(){
        return pathParam;
    }

    public String getPort(){
        return port;
    }

    public String getQueryParam(){
        return queryParam;
    }
}
