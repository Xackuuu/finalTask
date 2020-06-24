public class MailMessage extends MailBox<String> {
    public MailMessage(String from, String to, String content) {
        super(from, to, content);
    }

    @Override
    public String getContent() {
        return super.getContent();
    }

    @Override
    public String getTo() {
        return super.getTo();
    }

    @Override
    public String getFrom() {
        return super.getFrom();
    }
}
