package jp.co.kiramex.baseball;

public class baseBallTeam {

    //　フィールド
    public String name; //　チーム名
    public int win; // 勝利数
    public int lose; //敗北数
    public int draw; // 引分数
    public double winningRate; //勝率

    /*
    //　デフォルトコンストラクタ(引数ありのコントラクタを作成しない場合省略可能)
    public baseBallTeam() {
    }
    */

     //　勝率を計算するメソッド(自クラス内のフィールドを直接参照する方法)
    public double getRate() {
        double winningRate = (double) win / (win + lose); // int型の計算をdouble型にキャスト
        return winningRate; // 戻り値
    }

    //　結果を表示するメソッド
    public void report() {
        winningRate = this.getRate();
        System.out.println(name + "の2022年の成績は " + win + "勝 " + lose + "負 " + draw + "分、勝率は " + winningRate + "です。");
    }

}
