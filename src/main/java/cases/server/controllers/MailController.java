package cases.server.controllers;

import cases.server.db.interfaces.Repository;
import cases.server.entitiies.Mail;
import cases.server.servicies.interfaces.MailService;

import javax.inject.Inject;

public class MailController {
    private final MailService googleMailer;
    private final MailService yandexMailer;
    private final Repository<Mail> mails;

    @Inject
    public MailController(MailService googleMailer, MailService yandexMailer, Repository<Mail> mails) {
        this.googleMailer = googleMailer;
        this.yandexMailer = yandexMailer;
        this.mails = mails;
    }

    public void sendGoogleMail() {
        this.googleMailer.sendMail();
        mails.add(new Mail("google"));
    }

    public void sendYandexMail() {
        this.yandexMailer.sendMail();
        mails.add(new Mail("yandex"));
    }

    public void printAllMails(){
        mails.getAll().forEach(m -> System.out.println(m.getSource() + "\n"));
    }
}
