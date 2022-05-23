	import java.util.Scanner;

public class TextAdventure
	{
		public static void main(String[] args)
			{
						Scanner userStringInput = new Scanner(System.in);
						System.out.println("What is your name?");
						String name = userStringInput.nextLine();
						System.out.println("Hello, " + name + "!");
						Scanner userIntInput = new Scanner(System.in);
						System.out.println("You have entered the house of horrors, and you see two doors. One is blue, one red.");
						System.out.println("Which door do you choose to open?");
						System.out.println("\t(1) - The Red Door");
						System.out.println("\t(2) - The Blue Door");
						int doorChoice = userIntInput.nextInt();
						if(doorChoice==1)
							{
								System.out.println("The Red Door opens, and reveals a lit up room with another two doors");
								System.out.println("One door is green, and one is orange, which door do you choose?");
								System.out.println("\t(3) - The Green Door");
								System.out.println("\t(4) - The Orange Door");
								int doorChoice2 = userIntInput.nextInt();
								if(doorChoice2 == 3)
									{
										System.out.println("Unfortunately you died a horrible death to the ravid lion sitting just behind the door!");
									}
								if(doorChoice2 == 4)
									{
										System.out.println("Unfortunately you died a horrible death to the ravid lion sitting just behind the door!");
									}
							}
						else if(doorChoice==2)
							{
								System.out.println("The door creaks open, and reveals a dark hallway, with a bright light at the end");
								System.out.println("Now you have a decision to make, do you choose to turn around and run away, or do you choose to walk through the bright light?");
								System.out.println("\t(3) - Run Away");
								System.out.println("\t(4) - Walk through the light");
								int doorChoice3 = userIntInput.nextInt();
								if(doorChoice==3)
									{
										System.out.println("You live to fight another day, but the decision fills you with regret for the rest of your days.");
										System.exit(0);
									}
								if(doorChoice==4)
									{
										System.out.println("The light dims after walking through it, and you realize you have walked into a room with boundless riches to help you for the rest of your life!");
										System.out.println("Congratulations!");
										System.exit(0);
									}
								
							}
						else
							{
								System.out.println("You need to choose either number 1, or number 2");
							}
					
			
				
			}

	}
