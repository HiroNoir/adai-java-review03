package jp.co.kiramex.baseball;

public class Review03 {

    public static void main(String[] args) {

        // 6チームのインスタンス化

        BaseBallTeam team01 = new BaseBallTeam();
        team01.setTeamName("東京ヤクルトスワローズ") ;
        team01.setWinNum(80);
        team01.setLoseNum(59);
        team01.setDrawNum(4);

        BaseBallTeam team02 = new BaseBallTeam();
        team02.setTeamName("横浜DeNAベイスターズ") ;
        team02.setWinNum(73);
        team02.setLoseNum(68);
        team02.setDrawNum(2);

        BaseBallTeam team03 = new BaseBallTeam();
        team03.setTeamName("阪神タイガース") ;
        team03.setWinNum(68);
        team03.setLoseNum(71);
        team03.setDrawNum(4);

        BaseBallTeam team04 = new BaseBallTeam();
        team04.setTeamName("読売ジャイアンツ") ;
        team04.setWinNum(68);
        team04.setLoseNum(72);
        team04.setDrawNum(3);

        BaseBallTeam team05 = new BaseBallTeam();
        team05.setTeamName("広島東洋カープ") ;
        team05.setWinNum(66);
        team05.setLoseNum(74);
        team05.setDrawNum(3);

        BaseBallTeam team06 = new BaseBallTeam();
        team06.setTeamName("中日ドラゴンズ") ;
        team06.setWinNum(66);
        team06.setLoseNum(75);
        team06.setDrawNum(2);

        // 勝敗情報の表示
        team01.report();
        team02.report();
        team03.report();
        team04.report();
        team05.report();
        team06.report();

    }

}
