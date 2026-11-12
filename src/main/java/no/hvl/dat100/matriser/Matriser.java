package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] rad : matrise) {
			for (int verdi : rad) {
				System.out.print(verdi + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		StringBuilder sb = new StringBuilder();
		for (int r = 0; r < matrise.length; r++) {
			for (int c = 0; c < matrise[r].length; c++) {
				sb.append(matrise[r][c]);
				if (c < matrise[r].length - 1) {
					sb.append(" ");
				}
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] skalert = new int[matrise.length][];
		for (int r = 0; r < matrise.length; r++) {
			skalert[r] = new int[matrise[r].length];
			for (int c = 0; c < matrise[r].length; c++) {
				skalert[r][c] = matrise[r][c] * tall;
			}
		}
		return skalert;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if (a == b) {
			return true;
		}
		if (a == null || b == null || a.length != b.length) {
			return false;
		}
		for (int r = 0; r < a.length; r++) {
			if (a[r].length != b[r].length) {
				return false;
			}
			for (int c = 0; c < a[r].length; c++) {
				if (a[r][c] != b[r][c]) {
					return false;
				}
			}
		}
		return true;
	}

	// e)
	public static int[][] speile(int[][] matrise) {
		int rader = matrise.length;
		int kolonner = (rader > 0) ? matrise[0].length : 0;
		int[][] speilet = new int[kolonner][rader];

		for (int r = 0; r < rader; r++) {
			for (int c = 0; c < kolonner; c++) {
				speilet[c][r] = matrise[r][c];
			}
		}
		return speilet;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		if (a.length == 0 || b.length == 0 || a[0].length != b.length) {
			throw new IllegalArgumentException("Ugyldige dimensjoner for matrisemultiplikasjon");
		}

		int raderA = a.length;
		int felles = a[0].length;
		int kolonnerB = b[0].length;
		int[][] resultat = new int[raderA][kolonnerB];

		for (int r = 0; r < raderA; r++) {
			for (int c = 0; c < kolonnerB; c++) {
				int sum = 0;
				for (int k = 0; k < felles; k++) {
					sum += a[r][k] * b[k][c];
				}
				resultat[r][c] = sum;
			}
		}
		return resultat;
	}
}