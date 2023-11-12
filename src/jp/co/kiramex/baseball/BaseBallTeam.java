package jp.co.kiramex.baseball;

public class BaseBallTeam {

    //　フィールド
    public String name; //　チーム名
    public int win; // 勝利数
    public int lose; //敗北数
    public int draw; // 引分数

     //　勝率を計算するメソッド(自クラス内のフィールドを直接参照する方法)
    public double getRate() {
        double result = (double) win / (win + lose); // int型の計算をdouble型にキャスト
        return result; // 戻り値
    }

    //　結果を表示するメソッド
    public void report() {
        System.out.println(name + "の2022年の成績は " + win + "勝 " + lose + "負 " + draw + "分、勝率は " + this.getRate() + "です。");
    }

}
