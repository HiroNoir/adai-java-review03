package jp.co.kiramex.baseball;

public class BaseBallTeam {

    //　フィールド
    private String name; //　チーム名
    private int win; // 勝利数
    private int lose; //敗北数
    private int draw; // 引分数

    //　デフォルトコンストラクタ
    public BaseBallTeam() {
    }

    // setterメソッドを用いて値を代入
    public void setTeamName(String name) {
        this.name = name;
    }
    public void setWinNum(int win) {
        this.win = win;
    }
    public void setLoseNum(int lose) {
        this.lose = lose;
    }
    public void setDrawNum(int draw) {
        this.draw = draw;
    }

    // getterメソッドを用いて値を参照
    public String getTeamName() {
        return name;
    }
    public int getWinNum() {
        return win;
    }
    public int getLoseNum() {
        return lose;
    }
    public int getDrawNum() {
        return draw;
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
