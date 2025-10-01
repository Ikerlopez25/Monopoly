package edu.ncsu.monopoly;
//añadimos cambio
//añadimos comentario nuevoo
//comentario nusdfsdfsdfsdfevooo
public abstract class Card {

    public static final int TYPE_CHANCE = 1;
    public static final int TYPE_CC = 2;

    public abstract String getLabel();
    public abstract void applyAction();
    public abstract int getCardType();
}
