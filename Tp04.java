package byadsa.TP4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.util.Scanner;
import commun.Outils;

public class Tp04 {
	@BeforeEach
	void setup() {
		Outils.Aleatoire.resetSeedSet();
		Outils.Aleatoire.setSeed(123);
	}

	@Test
	void test11() {
		int[] nb = { 1, 2, 3, 4, 5 };
		int[] pts = { 0, 1, 4, 9, 16 };
		assertArrayEquals(new int[] { 0, 0, 0, 0, 16 }, calculScore(nb, pts));
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, nb);
		assertArrayEquals(new int[] { 0, 1, 4, 9, 16 }, pts);
	}

	@Test
	void test12() {
		int[] nb = { 5, 4, 3, 2, 1 };
		int[] pts = { 0, 1, 4, 9, 16 };
		assertArrayEquals(new int[] { 0, 0, 0, 0, 0 }, calculScore(nb, pts));
		assertArrayEquals(new int[] { 5, 4, 3, 2, 1 }, nb);
		assertArrayEquals(new int[] { 0, 1, 4, 9, 16 }, pts);
	}

	@Test
	void test13() {
		int[] nb = { 1, 2, 4, 3, 5 };
		int[] pts = { 0, 1, 4, 9, 16 };
		assertArrayEquals(new int[] { 0, 0, 4, 0, 1 }, calculScore(nb, pts));
		assertArrayEquals(new int[] { 1, 2, 4, 3, 5 }, nb);
		assertArrayEquals(new int[] { 0, 1, 4, 9, 16 }, pts);
	}

	@Test
	void test14() {
		int[] nb = { 5, 4, 1, 3, 2 };
		int[] pts = { 0, 1, 4, 9, 16 };
		assertArrayEquals(new int[] { 0, 0, 0, 1, 0 }, calculScore(nb, pts));
		assertArrayEquals(new int[] { 5, 4, 1, 3, 2 }, nb);
		assertArrayEquals(new int[] { 0, 1, 4, 9, 16 }, pts);
	}

	@Test
	void test15() {
		int[] nb = { 1, 2, 2, 3, 1 };
		int[] pts = { 0, 1, 4, 9, 16 };
		assertArrayEquals(new int[] { 0, 0, 0, 9, 0 }, calculScore(nb, pts));
		assertArrayEquals(new int[] { 1, 2, 2, 3, 1 }, nb);
		assertArrayEquals(new int[] { 0, 1, 4, 9, 16 }, pts);
	}

	@Test
	void test21() {
		int[] nb = { 1, 4, 3, 2, 5 };
		boolean[] dis = { true, true, true, true, true };
		assertEquals(3, pigeTuile(nb, dis));
		assertArrayEquals(new int[] { 1, 4, 3, 2, 5 }, nb);
		assertArrayEquals(new boolean[] { true, true, false, true, true }, dis);
	}

	@Test
	void test22() {
		int[] nb = { 1, 4, 3, 2, 5 };
		boolean[] dis = { true, true, false, true, true };
		assertEquals(1, pigeTuile(nb, dis));
		assertArrayEquals(new int[] { 1, 4, 3, 2, 5 }, nb);
		assertArrayEquals(new boolean[] { false, true, false, true, true }, dis);
	}

	@Test
	void test23() {
		int[] nb = { 1, 4, 3, 2, 5 };
		boolean[] dis = { false, true, false, true, true };
		assertEquals(4, pigeTuile(nb, dis));
		assertArrayEquals(new int[] { 1, 4, 3, 2, 5 }, nb);
		assertArrayEquals(new boolean[] { false, false, false, true, true }, dis);
	}

	@Test
	void test24() {
		int[] nb = { 1, 4, 3, 2, 5 };
		boolean[] dis = { false, false, true, true, false };
		assertEquals(3, pigeTuile(nb, dis));
		assertArrayEquals(new int[] { 1, 4, 3, 2, 5 }, nb);
		assertArrayEquals(new boolean[] { false, false, false, true, false }, dis);
	}

	@Test
	void test25() {
		int[] nb = { 5, 4, 3, 2, 1 };
		boolean[] dis = { true, false, false, false, true };
		assertEquals(5, pigeTuile(nb, dis));
		assertArrayEquals(new int[] { 5, 4, 3, 2, 1 }, nb);
		assertArrayEquals(new boolean[] { false, false, false, false, true }, dis);
	}

	@Test
	void test31() {
		assertEquals(25, somme(new int[] { 1, 3, 5, 7, 9 }));
	}

	@Test
	void test32() {
		assertEquals(6, somme(new int[] { 1, 0, 0, 5, 0 }));
	}

	@Test
	void test33() {
		assertEquals(0, somme(new int[] { 0, 0, 0, 0, 0 }));
	}

	@Test
	void test34() {
		assertEquals(8, somme(new int[] { 8 }));
	}

	@Test
	void test35() {
		assertEquals(0, somme(new int[] {}));
	}

	@Test
	void test41() {
		assertEquals(4, maximum(new int[] { 1, 3, 5, 7, 9 }));
	}

	@Test
	void test42() {
		assertEquals(1, maximum(new int[] { 1, 8, 4, 6 }));
	}

	@Test
	void test43() {
		assertEquals(0, maximum(new int[] { 9, 7, 5, 3, 1 }));
	}

	@Test
	void test44() {
		assertEquals(0, maximum(new int[] { 5 }));
	}

	@Test
	void test45() {
		assertEquals(2, maximum(new int[] { 3, 3, 8, 8, 3 }));
	}

	@Test
	void test51() {
		assertEquals(1, trouve(new int[] { 1, 3, 5, 7, 9 }, 3));
	}

	@Test
	void test52() {
		assertEquals(0, trouve(new int[] { 1, 3, 5, 7, 9 }, 1));
	}

	@Test
	void test53() {
		assertEquals(4, trouve(new int[] { 1, 3, 5, 7, 9 }, 9));
	}

	@Test
	void test54() {
		assertEquals(-1, trouve(new int[] { 1, 3, 5, 7, 9 }, 4));
	}

	@Test
	void test55() {
		assertEquals(-1, trouve(new int[] {}, 7));
	}

	public static final int NB_CASES = 7; // Nombre de cases à remplir par partie, maximum 20

	public static void main(String[] args) {
		// A FAIRE (45) : code
		Outils.Aleatoire.setSeed(9531);
		Scanner cl = new Scanner(System.in);
		char dist;
		char pointage;
		int scoreMax;
		int scoreTotal;
		int[] tuiles = new int[40];
		int[] points = { 0, 1, 3, 5, 7, 9, 11, 15, 20, 25, 30, 35, 40, 50, 60, 70, 85, 100, 150, 300 }; // Déclarer un
																										// tableau pour
																										// les points et
																										// l'initialiser
																										// avec les
																										// points
		// de base inscrits sur la feuille de pointage disponible dans l'énoncé
		// Créer un tableau de taille quarante pour stocker les tuiles
		do {
			scoreMax = 0;
			scoreTotal = 0;
			System.out.print("Sélectionnez le pointage de Base ou Expert ou Quitter :");
			pointage = cl.next().charAt(0);
			if (pointage == 'Q') {
				System.out.println("Votre record est :" + scoreMax);
				System.out.println("Bonne journée");

			}
			System.out.print("Distribution des chiffres, soit Classique ou Différents?");
			dist = cl.next().charAt(0);

			// Répéter
			// Si l'usager ne choisit pas de quitter(pointage != 'q' || pointage != 'Q')
			switch (pointage) {
				case 'B':
					points[5] = 9;
					points[11] = 35;
					points[16] = 85;
					break;

				case 'E':
					points[5] = 3;
					points[11] = 20;
					points[16] = 50;

					break;

			}

			switch (dist) {
				case 'C':
					for (int i = 0; i <= 30; ++i) {
						tuiles[i] = i;
					}
					for (int i = 31; i <= 39; ++i) {
						tuiles[i] = i - 20;
					}

					// int[] tuiles =
					// {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,11,12,13,14,15,16,17,18,19};

					break;
				case 'D':
					for (int i = 0; i < tuiles.length; ++i) {
						tuiles[i] = i + 1;
					}

					break;
			}
			System.out.println("Total de la partie =" + jouerPartie(cl, tuiles, points));
		} while (pointage != 'q' || pointage != 'Q');

	}

	// On modifie les trois cases du tableau des points selon le type de pointage*
	// choisi*
	// On initialise le tableau des tuiles selon la distribution désirée*
	// Appel de jouerPartie() et récupération du score final
	// Mise à jour du score maximal si le joueur a fait un nouveau record
	// Tant que le joueur ne choisit pas de quitter
	// Afficher le pointage record et saluer le joueur

	// A FAIRE (14) : code - documentation(/**)
	/** jouerPartie
	 * 
	 * @param cl utilisateur
	 * @param tuiles nombre de case dans une partie
	 * @param points point pour la partie
	 * @return retourne le score total de la partie
	 */
	public static int jouerPartie(Scanner cl, int[] tuiles, int[] points) {
		// tuiles et points ne doivent pas être modifiés
		int[] cases;
		int[] score;// Déclarer un tableau de cases et de scores, mais ne pas les initialiser
		cases = toursDeJeu(cl, tuiles);// Appeler toursDeJeu() et récupérer le tableau de cases

		changeJoker(cl, cases);// Appeler changeJoker()
		score = calculScore(cases, points);// Appeler calculScore() et récupérer le tableau des scores
		int totalScore = somme(score);// Appeler somme() pour obtenir le score total
		int posMaxScore = maximum(score);// Appeler maximum() pour obtenir la poisition du score maximal pour une suite
		System.out.println("Total de la partie =" + totalScore + "(" + score[posMaxScore] + ")");// Afficher le résultat
																									// de la partie
		return totalScore; // Retourner le score total
	}

	// A FAIRE (26) : code - documentation(/**)
	/** toursDeJeu
	 * 
	 * @param cl utilisateur
	 * @param tuiles tuiles dispo
	 * @return retourne les case remplie
	 */
	public static int[] toursDeJeu(Scanner cl, int[] tuiles) {
		int[]cases=new int[NB_CASES];
		
		for(int i =0;i<NB_CASES;i++){
			cases[i]=-1;
      
		}
		int[]positions=new int[NB_CASES];
		for(int i =0;i<NB_CASES;i++){
			positions[i]=i+1;
      
		}
		boolean[] tuilesDisp=new boolean [tuiles.length];
		for(int i=0;i<tuilesDisp.length;i++){
			tuilesDisp[i]=true;
      
		}
		for(int i =0;i<NB_CASES;i++){
		
		int tuilePiger=pigeTuile(tuiles, tuilesDisp);
		affiche(positions, '-', '/', i, "**");
		System.out.println("Position d'ajout du nombre "+  tuilePiger +">");
		int pos = cl.nextInt()-1;
		while (pos<0||pos>=NB_CASES||cases[pos]!=-1) {
			System.out.println("Cette position est invalide, choisissez-en une autre >");
			pos=cl.nextInt()-1;
			
		}
		cases[pos]=tuilePiger;
      
		}
		// tuiles ne doit pas être modifié
		// Initialiser un tableau de cases à -1 ayant pour taille NB_CASES
		// Initialiser un tableau de positions avec les nombres de 1 à NB_CASES
		// Initialiser un tableau tuiles disponibles à vrai (true) de la même taille que
		// tuiles
		// Pour le nombre de cases à remplir, piger une tuile, afficher l'état actuel
		// des cases, demander la position d'ajout au joueur, jusqu'à ce qu'il
		// entre une position valide, et écrire la tuile dans la case.
		// Indice : Les positions du joueur débutent à 1 alors que votre tableau débute
		// à 0
		return cases; // Retourne le tableau de cases rempli
	}

	// A FAIRE (8) : code - documentation(/**)
	/** changeJoker
	 * 
	 * @param cl utilisateur
	 * @param cases position de la case 
	 */
	public static void changeJoker(Scanner cl, int[] cases) {
		int posJoker=trouve(cases, -1);

		if(posJoker!=-1){
			System.out.println( "En quelle valeur voulez-vous changer le JOKER?");
			int valJoker=cl.nextInt();
			cases[posJoker]=valJoker;
		}
		// Le tableau cases peut être modifié si un JOKER est présent
		// Lire la documentation de l'énoncé et utiliser la fonction trouve()
	}

	// A FAIRE (13) : code - documentation(/**)
	/**calculScore
	 * 
	 * @param cases position cases
	 * @param points verification du score
	 * @return retourne  nouveau score du joueur
	 */
	public static int[] calculScore(int[] cases, int[] points) {
		int[] nouvScore=new int[NB_CASES];
		int longSuite=1;
		for(int i =1;i<cases.length;i++){
			if(cases[i-1]+1==cases[i]){
				longSuite++;
			}else{
				nouvScore[i-longSuite]=points[longSuite-1];
				longSuite=1;
			}
		}
		// cases et points ne doivent pas être modifiés
		// Aucun affichage n'est réalisé par cette fonction
		// Initialiser à zéro un tableau de scores de la même taille que le tableau
		// cases
		// Initialiser la longueur de la suite à 1
		// Pour chaque paire de cases adjacentes, vérifier s'il s'agit de la fin
		// d'une suite et faire le traitement approprié
		// Ne pas oublier d'écrire les points de la dernière suite
		return nouvScore; // Retourne le tableau des scores créé
	}

	// A FAIRE (8) : code - documentation(/**)
	/** pigeTuile
	 * 
	 * @param tuiles tuiles aleatoire
	 * @param disponible si disponible oui ou non 
	 * @return retourne tuile piger
	 */
	public static int pigeTuile(int[] tuiles, boolean[] disponible) {
		int nbAJouter;
		Outils.Aleatoire.setSeed(9531);
		do{
			nbAJouter=Outils.Aleatoire.nextInt(tuiles.length);
       }	
	   while(!disponible[nbAJouter]);
	   disponible[nbAJouter]=false;
		// Seul tuiles ne doit pas être modifié
		// Aucun affichage n'est réalisé par cette fonction
		// Lire la documentation de l'énoncé et utiliser Outils.Aleatoire
		// Indice : Ne pas oublier de mettre la tuile pigée à
		// false dans le tableau disponible
		return tuiles[nbAJouter]; // Retourne la valeur de la tuile pigée
	}

	// A FAIRE (15) : code - documentation(/**)
	
	public static void affiche(int[] tab, char sepC, char sepD, int val, String rem) {
		for(int i =0;i<tab.length;i++){
			if(i==0){
				System.out.print(tab[i]);
			}else{
			if(tab[i]>=tab[i-1]){
				System.out.print(sepC);
			}else{
				System.out.print(sepD);

			}
				System.out.print(tab[i]);
			}
		}
		System.out.println();
		// tab ne doit pas être modifié
		// Lire la documentation de l'énoncé et utiliser String.formatted()
		// Indice : Faire un cas spécial pour le premier élément qui ne
		// doit pas être précédé d'un séparateur
	}

	// A FAIRE (6) : code - documentation(/**)
	/** somme
	 * 
	 * @param vecteur somme dans le tableau vecteur
	 * @return retourne la somme
	 */
	public static int somme(int[] vecteur) {
		int somme = 0;
		for (int i = 0; i < vecteur.length; ++i) {
			somme += vecteur[i];
		}
		// vecteur ne doit pas être modifié
		// Aucun affichage n'est réalisé par cette fonction
		// Indice : Notes de cours
		return somme; // Retourne une valeur
	}

	// A FAIRE (8) : code - documentation(/**)
	/** maximum
	 * 
	 * @param vecteur cherche la valeur maximal
	 * @return retourne la position max
	 */
	public static int maximum(int[] vecteur) {
		int posMax = 0;
		for (int i = 1; i < vecteur.length; ++i) { // Au départ, la 1ière valeur est le max
			if (vecteur[i] > vecteur[posMax]) {// On commence par la 2e valeur (i=1)
				posMax = 1;// Si on trouve une valeur plus petite
			}
		}
		// Mise à jour de la position du min

		// Si on trouve une valeur plus grande
		// Mise à jour de la position du max

		// vecteur ne doit pas être modifié
		// Aucun affichage n'est réalisé par cette fonction
		// Indice : Notes de cours
		return posMax;
		// Retourne une position

	}

	// A FAIRE (9) : code - documentation(/**)
	/** trouve
	 * 
	 * @param vecteur recherche la valeur recu en parametre du tableau vecteur
	 * @param valeur valeur absente ou non
	 * @return la postion
	 */
	public static int trouve(int[] vecteur, int valeur) {
		int pos = 0;
		while (pos < vecteur.length && vecteur[pos] != valeur) {
			pos++;
		}
		if (pos == vecteur.length) {
			pos = -1;

		}
		// vecteur ne doit pas être modifié
		// Aucun affichage n'est réalisé par cette fonction
		// Indice : Notes de cours
		return pos; // Retourne une position
	}
}
