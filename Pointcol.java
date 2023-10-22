package tp4heritage1;

public class Pointcol extends Point {
		private String couleur;
		
		Pointcol(){
			super();
			couleur="";
			
		}
		
		Pointcol(char nom,int abs,int ord,String couleur){
			super(nom,abs,ord);
			this.couleur=couleur;
		}
		
		void setCol(String col) {
			this.couleur=col;
		}
		
		@Override void affichier(){
			super.affichier();
			System.out.println(" a comme couleur :  "+couleur);
		}
		

	}
