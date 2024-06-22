package com.example.unogame.model.url_cards;

/**
 * Represents the file paths of the images used in the Uno Game
 */
public enum FilePathEnum {

    UNOICON("images/uno-icon.png"),
    BACKGROUND_WELCOME_UNO("images/background-welcome-view.png"),
    BACKGROUND_GAME_UNO("images/background-game-view.png"),
    CARD_UNO("images/uno-cards/card_uno.png"),
    DECK_OF_CARDS("images/uno-cards/deck_of_cards.png"),
    WILD("images/uno-cards/wild.png"),
    TWO_WILD_DRAW_BLUE("images/uno-cards/2_wild_draw_blue.png"),
    TWO_WILD_DRAW_GREEN("images/uno-cards/2_wild_draw_green.png"),
    TWO_WILD_DRAW_YELLOW("images/uno-cards/2_wild_draw_yellow.png"),
    TWO_WILD_DRAW_RED("images/uno-cards/2_wild_draw_red.png"),
    FOUR_WILD_DRAW("images/uno-cards/4_wild_draw.png"),
    SKIP_BLUE("images/uno-cards/skip_blue.png"),
    SKIP_YELLOW("images/uno-cards/skip_yellow.png"),
    SKIP_GREEN("images/uno-cards/skip_green.png"),
    SKIP_RED("images/uno-cards/skip_red.png"),
    RESERVE_BLUE("images/uno-cards/reserve_blue.png"),
    RESERVE_YELLOW("images/uno-cards/reserve_yellow.png"),
    RESERVE_GREEN("images/uno-cards/reserve_green.png"),
    RESERVE_RED("images/uno-cards/reserve_red.png"),
    GREEN_0("images/uno-cards/0_green.png"),
    GREEN_1("images/uno-cards/1_green.png"),
    GREEN_2("images/uno-cards/2_green.png"),
    GREEN_3("images/uno-cards/3_green.png"),
    GREEN_4("images/uno-cards/4_green.png"),
    GREEN_5("images/uno-cards/5_green.png"),
    GREEN_6("images/uno-cards/6_green.png"),
    GREEN_7("images/uno-cards/7_green.png"),
    GREEN_8("images/uno-cards/8_green.png"),
    GREEN_9("images/uno-cards/9_green.png"),
    YELLOW_0("images/uno-cards/0_yellow.png"),
    YELLOW_1("images/uno-cards/1_yellow.png"),
    YELLOW_2("images/uno-cards/2_yellow.png"),
    YELLOW_3("images/uno-cards/3_yellow.png"),
    YELLOW_4("images/uno-cards/4_yellow.png"),
    YELLOW_5("images/uno-cards/5_yellow.png"),
    YELLOW_6("images/uno-cards/6_yellow.png"),
    YELLOW_7("images/uno-cards/7_yellow.png"),
    YELLOW_8("images/uno-cards/8_yellow.png"),
    YELLOW_9("images/uno-cards/9_yellow.png"),
    BLUE_0("images/uno-cards/0_blue.png"),
    BLUE_1("images/uno-cards/1_blue.png"),
    BLUE_2("images/uno-cards/2_blue.png"),
    BLUE_3("images/uno-cards/3_blue.png"),
    BLUE_4("images/uno-cards/4_blue.png"),
    BLUE_5("images/uno-cards/5_blue.png"),
    BLUE_6("images/uno-cards/6_blue.png"),
    BLUE_7("images/uno-cards/7_blue.png"),
    BLUE_8("images/uno-cards/8_blue.png"),
    BLUE_9("images/uno-cards/9_blue.png"),
    RED_0("images/uno-cards/0_red.png"),
    RED_1("images/uno-cards/1_red.png"),
    RED_2("images/uno-cards/2_red.png"),
    RED_3("images/uno-cards/3_red.png"),
    RED_4("images/uno-cards/4_red.png"),
    RED_5("images/uno-cards/5_red.png"),
    RED_6("images/uno-cards/6_red.png"),
    RED_7("images/uno-cards/7_red.png"),
    RED_8("images/uno-cards/8_red.png"),
    RED_9("images/uno-cards/9_red.png");

    private final String filePath;
    private static final String PATH = "/org/example/unogame/";

    /**
     * Constructor of the enum file paths
     *
     * @param filePath
     */
    FilePathEnum(String filePath) {
        this.filePath = PATH + filePath;
    }

    /**
     * Gets the full file path of an image
     *
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }
}
