public class Main {
    public static void main(String[] args) {
        System.out.println("Dungeon Map:");
        for (int y = 0; y < DungeonMap.MAP.length; y++) {
            for (int x = 0; x < DungeonMap.MAP[y].length; x++) {
                System.out.print(DungeonMap.MAP[y][x] + " ");
            }
            System.out.print("\n");
        }

        // TODO: Complete this lab!
        Adventurer dude = new Adventurer();
        dude.scanSurroundings(DungeonMap.MAP);
        dude.findPaths();
        dude.findMST();
    }
}