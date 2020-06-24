public class Salary extends MailBox<Integer> {

    public Salary(String from, String to, Integer content) {
        super(from, to, content);
    }

    @Override
    public Integer getContent() {
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
