package tp4heritage1;

public class TestPointCol {

	public static void main(String[] args) {
		Pointcol p1 = new Pointcol('A',2,3,"red");
		p1.affichier();
		p1.setCol("blue");
		System.out.println(" \n Apres la modification : ");
		p1.affichier();
		

		Point p2 = new Point('B',1,4);
		System.out.println(" \n");
		p2.affichier();
		//affecter un objet Point à un autre PointCol
		//p1=p2;  //on ne peut pas
		
		p2=p1; //cannot convert from point to pointcol
		System.out.println(" \n Apres l'affectation de PointCol a un autre Point : ");
		p2.affichier();
		
	}

}
