package cases.scope.music1;

import framework.context.ContextBuilder;

public class RunMusic {
    public static void main(String[] args) {
        var builder = new ContextBuilder();
        var context = builder.setConfiguration("src/main/resources/valuesConfig.json").Build();

        context.run("cases.scope.music1");

        MusicPlayer musicPlayer1 = context.getType(MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getType(MusicPlayer.class);

        Computer computer1 = context.getType(Computer.class);
        Computer computer2 = context.getType(Computer.class);

        Music music1 = context.getType(ClassicalMusic.class);
        Music music2 = context.getType(ClassicalMusic.class);

        Music music3 = context.getType(RockMusic.class);
        Music music4 = context.getType(RockMusic.class);

        System.out.println(computer1.result());
        System.out.println(computer2.result());

        System.out.println(musicPlayer1);
        System.out.println(musicPlayer2);

        System.out.println(computer1);
        System.out.println(computer2);
    }
}
