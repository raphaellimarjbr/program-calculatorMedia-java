import java.util.Scanner;

public class init {
	public static void main (String[] Args) {
		//Variables
			double av1,av2,av3,av4,media;
			int frequency1,frequency2,frequency3,frequency4,frequencies;
			Scanner read = new Scanner(System.in);
		//AV1
			System.out.println("Digite a sua nota da AV1: ");
			av1 = read.nextDouble();
				while (av1 > 10 || av1 < 0) {
					System.out.println("Dado inválido! Digite novamente a sua AV1: ");
					av1 = read.nextDouble();
				}
			//Frequency AV1
				System.out.println("Digite a sua frequência da AV1: ");
				frequency1 = read.nextInt();
					while (frequency1 > 10 || frequency1 < 0) {
						System.out.println("Dado inválido! Digite novamente a sua frequência da AV1: ");
						frequency1 = read.nextInt();
					}
			//AV2
				System.out.println("Digite a sua nota da AV2: ");
				av2 = read.nextDouble();
					while (av2 > 10 || av2 < 0) {
						System.out.println("Dado inválido! Digite novamente a sua AV2: ");
						av2 = read.nextDouble();
					}
				//Frequency AV2
					System.out.println("Digite a sua frequência da AV2: ");
					frequency2 = read.nextInt();
						while (frequency2 > 10 || frequency2 < 0) {
							System.out.println("Dado inválido! Digite novamente a sua frequência da AV2: ");
							frequency2 = read.nextInt();
						}
				//AV3
					System.out.println("Digite a sua nota da AV3: ");
					av3 = read.nextDouble();
						while (av3 > 10 || av3 < 0) {
							System.out.println("Dado inválido! Digite novamente a sua AV3: ");
							av3 = read.nextDouble();
						}
					//Frequency AV3
						System.out.println("Digite a sua frequência da AV3: ");
						frequency3 = read.nextInt();
							while (frequency3 > 10 || frequency3 < 0) {
								System.out.println("Dado inválido! Digite novamente a sua frequência da AV3: ");
								frequency3 = read.nextInt();
							}
				//AV4
					System.out.println("Digite a sua nota da AV4: ");
					av4 = read.nextDouble();
						while (av4 > 10 || av4 < 0) {
							System.out.println("Dado inválido! Digite novamente a sua AV4: ");
							av4 = read.nextDouble();
						}
					//Frequency AV4
						System.out.println("Digite a sua frequência da AV4: ");
						frequency4 = read.nextInt();
							while (frequency4 > 10 || frequency4 < 0) {
								System.out.println("Dado inválido! Digite novamente a sua frequência da AV4: ");
								frequency4 = read.nextInt();
							}
		//Results
			media = (av1+av2+av3+av4) / 2;
			frequencies = (frequency1*frequency2*frequency3*frequency4) / 100;
			if (media >= 7 && frequencies >= 75) {
				System.out.println("\n"+"Você passou! com: "+media);
				System.out.println("Com uma frequência de: "+frequencies+"%");
			}
	}
}