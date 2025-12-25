package June20.Openai;

public class Driver {
    public static void main(String[] args) {
        App[] apps = new App[5];

        apps[0] = new App("ChatGPT", 2, new Patent(1034, "OpenAI"));
        apps[1] = new App("Snapchat", 1, new Patent(998, "Snap Inc."));
        apps[2] = new App("Instagram", 2, new Patent(1203, "Meta"));
        apps[3] = new App("Spotify", 1, new Patent(870, "Spotify Ltd."));
        apps[4] = new App("Zoom", 2, new Patent(1100, "Zoom Inc."));

 
        for (App app : apps) {
            app.showPatent();
        }

     
        int minPatent = apps[0].patent.patentNum;
        App minApp = apps[0];

        for (int i = 1; i < apps.length; i++) {
            if (apps[i].patent.patentNum < minPatent) {
                minPatent = apps[i].patent.patentNum;
                minApp = apps[i];
            }
        }

        System.out.println("App with smallest patent number:");
        minApp.showPatent();
    }
}