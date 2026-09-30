package tp4;
import java.util.ArrayList;

public class Arbre {
	public void prefixe(Node n) {
		if (n==null) {
			return;
		} else {
			System.out.print(n.getVal() + ' ');
			prefixe(n.getNodeGauche());
			prefixe(n.getNodeDroit());
		}
	}
	public void infixe(Node n) {
		if (n==null) {
			return;
		} else {
			infixe(n.getNodeGauche());
			System.out.print(n.getVal() + ' ');
			infixe(n.getNodeDroit());
		}
	}
	public void postfixe(Node n) {
		if (n==null) {
			return;
		} else {
			postfixe(n.getNodeGauche());
			postfixe(n.getNodeDroit());
			System.out.print(n.getVal() + ' ');
		}
	}
	
	
	
	//sous-classe node : noeud de l'arbre
	private static class Node {
		private int valeur;
		private Node gauche;
		private Node droit;
		//getter setter;
		private void setVal(int val) {
			this.valeur = val;
		}
		private void setGauche(int val) {
			this.gauche = new Node(val);
		}
		private void setGauche(Node n) {
			this.valeur = n.valeur;
		}
		private void setDroit(int val) {
			this.droit = new Node(val);
		}
		private void setDroit(Node n) {
			this.droit = n;
		}
		private int getVal() {
			return(this.valeur);
		}
		private int getGauche() {
			return(this.gauche.valeur);
		}
		private int getDroit() {
			return(this.droit.valeur);
		}
		
		private Node getNodeGauche() {
			return(this.gauche);
		}
		private Node getNodeDroit() {
			return(this.droit);
		}
		//constructeur;
		private Node(int val) {
			setVal(val);
			setGauche(null);
			setDroit(null);
		}
		private Node(int val, int val2) {
			setVal(val);
			setGauche(val2);
			setDroit(null);
		}
		private Node(int val, int val2, int val3) {
			setVal(val);
			setGauche(val2);
			setDroit(val3);
		}
		private Node(int val, Node n) {
			setVal(val);
			setGauche(n);
			setDroit(null);
		}
		private Node(int val, Node n1, Node n2) {
			setVal(val);
			setGauche(n1);
			setDroit(n2);
		}
		private Node(int val, Node n, int val2) {
			setVal(val);
			setGauche(n);
			setDroit(val2);
		}
		private Node(int val, int val2, Node n) {
			setVal(val);
			setGauche(val2);
			setDroit(n);
		}
	}
}
