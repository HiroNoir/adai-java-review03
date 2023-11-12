package jp.co.kiramex.baseball2;

public class Review03_constructor {

    public static void main(String[] args) {

            // 6チームのインスタンス化
            BaseBallTeam_constructor team01 = new BaseBallTeam_constructor("東京ヤクルトスワローズ", 80, 59, 4);
            BaseBallTeam_constructor team02 = new BaseBallTeam_constructor("横浜DeNAベイスターズ", 73, 68, 2);
            BaseBallTeam_constructor team03 = new BaseBallTeam_constructor("阪神タイガース", 68, 71, 4);
            BaseBallTeam_constructor team04 = new BaseBallTeam_constructor("読売ジャイアンツ", 68, 72, 3);
            BaseBallTeam_constructor team05 = new BaseBallTeam_constructor("広島東洋カープ", 66, 74, 3);
            BaseBallTeam_constructor team06 = new BaseBallTeam_constructor("中日ドラゴンズ", 66, 75, 2);

            // 勝敗情報の表示
            team01.report();
            team02.report();
            team03.report();
            team04.report();
            team05.report();
            team06.report();

    }

}
