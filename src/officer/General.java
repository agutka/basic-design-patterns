package officer;

import message.Message;

public class General extends Officer {

    private static final int CODE = 100;
    private static final String NAME = "Generał Zaborowski";

    @Override
    public void processMessage(Message message) {
        if(message.getOfficerRank().equals(OfficerRank.GENERAL) && message.getCode() == CODE) {
            System.out.println(NAME + " otrzymał wiadomość " + message.getContent());
        }else {
            System.out.println("Zły adresat wiadomośći lub kod szyfrujący!");
        }
    }
}
