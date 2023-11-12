package jp.co.kiramex.baseball2;

public class BaseBallTeam_constructor {

    //　フィールド
    private String name; //　チーム名
    private int win; // 勝利数
    private int lose; //敗北数
    private int draw; // 引分数

    //　デフォルトコンストラクタ
    public BaseBallTeam_constructor() {
    }

    //　引数ありコンストラクタ
    public BaseBallTeam_constructor(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    //　勝率を計算するメソッド
    public double getRate() {
        double result = (double) win / (win + lose); // int型の計算をdouble型にキャスト
        return result; // 戻り値
    }

    //　結果を表示するメソッド
    public void report() {
        System.out.println(name + "の2022年の成績は " + win + "勝 " + lose + "敗 " + draw + "分、勝率は " + this.getRate() + "です。");
    }
}
