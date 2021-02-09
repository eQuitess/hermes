package pl.allegro.tech.hermes.common.kafka;

public class KafkaConsumerPoolConfig {

    private final int cacheExpirationSeconds;
    private final int bufferSizeBytes;
    private final int fetchMaxWaitMillis;
    private final int fetchMinBytes;
    private final String idPrefix;
    private final String consumerGroupName;
    private final boolean isSaslEnabled;
    private final String securityMechanism;
    private final String securityProtocol;
    private final String saslJaasConfig;
    private boolean isSslEnabled;
    private String sslProtocol;
    private String sslTruststoreLocation;
    private String sslTruststorePassword;
    private String sslKeystoreLocation;
    private String sslKeystorePassword;
    private String sslKeyPassword;

    public KafkaConsumerPoolConfig(int cacheExpirationSeconds, int bufferSize, int fetchMaxWaitMillis,
                                   int fetchMinBytes, String idPrefix, String consumerGroupName,
                                   boolean isSaslEnabled, String securityMechanism, String securityProtocol, String saslJaasConfig,
                                   boolean isSslEnabled, String sslProtocol, String sslTruststoreLocation, String sslTruststorePassword,
                                   String sslKeystoreLocation, String sslKeystorePassword, String sslKeyPassword) {
        this.cacheExpirationSeconds = cacheExpirationSeconds;
        this.bufferSizeBytes = bufferSize;
        this.fetchMaxWaitMillis = fetchMaxWaitMillis;
        this.fetchMinBytes = fetchMinBytes;
        this.idPrefix = idPrefix;
        this.consumerGroupName = consumerGroupName;
        this.isSaslEnabled = isSaslEnabled;
        this.securityMechanism = securityMechanism;
        this.securityProtocol = securityProtocol;
        this.saslJaasConfig = saslJaasConfig;
        this.isSslEnabled = isSslEnabled;
        this.sslProtocol = sslProtocol;
        this.sslTruststoreLocation = sslTruststoreLocation;
        this.sslTruststorePassword = sslTruststorePassword;
        this.sslKeystoreLocation = sslKeystoreLocation;
        this.sslKeystorePassword = sslKeystorePassword;
        this.sslKeyPassword = sslKeyPassword;
    }

    public int getCacheExpirationSeconds() {
        return cacheExpirationSeconds;
    }

    public int getBufferSizeBytes() {
        return bufferSizeBytes;
    }

    public String getIdPrefix() {
        return idPrefix;
    }

    public String getConsumerGroupName() {
        return consumerGroupName;
    }

    public int getFetchMaxWaitMillis() {
        return fetchMaxWaitMillis;
    }

    public int getFetchMinBytes() {
        return fetchMinBytes;
    }

    public boolean isSaslEnabled() {
        return isSaslEnabled;
    }

    public String getSecurityMechanism() {
        return securityMechanism;
    }

    public String getSecurityProtocol() {
        return securityProtocol;
    }

    public String getSaslJaasConfig() {
        return saslJaasConfig;
    }

    public boolean isSslEnabled() {
        return isSslEnabled;
    }

    public void setSslEnabled(boolean sslEnabled) {
        isSslEnabled = sslEnabled;
    }

    public String getSslProtocol() {
        return sslProtocol;
    }

    public void setSslProtocol(String sslProtocol) {
        this.sslProtocol = sslProtocol;
    }

    public String getSslTruststoreLocation() {
        return sslTruststoreLocation;
    }

    public void setSslTruststoreLocation(String sslTruststoreLocation) {
        this.sslTruststoreLocation = sslTruststoreLocation;
    }

    public String getSslTruststorePassword() {
        return sslTruststorePassword;
    }

    public void setSslTruststorePassword(String sslTruststorePassword) {
        this.sslTruststorePassword = sslTruststorePassword;
    }

    public String getSslKeystoreLocation() {
        return sslKeystoreLocation;
    }

    public void setSslKeystoreLocation(String sslKeystoreLocation) {
        this.sslKeystoreLocation = sslKeystoreLocation;
    }

    public String getSslKeystorePassword() {
        return sslKeystorePassword;
    }

    public void setSslKeystorePassword(String sslKeystorePassword) {
        this.sslKeystorePassword = sslKeystorePassword;
    }

    public String getSslKeyPassword() {
        return sslKeyPassword;
    }

    public void setSslKeyPassword(String sslKeyPassword) {
        this.sslKeyPassword = sslKeyPassword;
    }
}
