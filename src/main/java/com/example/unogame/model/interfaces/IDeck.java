package com.example.unogame.model.interfaces;

import com.example.unogame.model.Card;
import java.util.ArrayList;

public interface IDeck {

    void setCardsDeck();
    String getCardValue(String cardName);
    String getCardColor(String cardName);
    ArrayList<Card> getCardsDeck();
    void showDeckCards();
    void removeCard(String cardId);

}
