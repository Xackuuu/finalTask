class MailBox<T> {
    private String from;
    private String to;
    private T content;

    public MailBox(String from, String to, T content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public T getContent() {
        return content;
    }
}
