 

/* Cours de POO - Éléments de correction
 * GIRARD PATRICK
 * Date : 10 sept. 2005
 *
 * Ici, on a choisi d'implémenter les couleurs par une chaîne et de mettre une valeur par défaut
 * à noir ; on met également les couleurs en majuscules, en contrôlant leurs valeurs. Si la valeur
 * est incorrecte, la tortue écrit en noir.
 */
public class TortueCouleur extends TortueG {

    // Attributs
    // Couleurs
    private static final String lesCouleurs[] = { "black", "white", "magenta", "red", "blue", "green", "yellow" };
    private String couleur = "BLACK";
    
    // Constructeur
    public TortueCouleur() {
        direction=3; 
    }

    // Constructeur avec couleur
    public TortueCouleur(String coul) {
    //    this();
        couleur = rendCouleur(coul);
    }
    public void setCouleur(String coul){
        couleur = rendCouleur(coul);
    }
    public String getCouleur() {
        return couleur;
    }
    
    // Toutes les primitives issues de la modélisation UML
      /**
     * Affichage de l'état de la tortue
     */
    public void afficherEtat()
    {
        System.out.println("La tortue est en x:" + x + ", y:" + y +
                            ", et en direction : " + direction + 
                            " et trace en " + couleur);
        super.afficherTortue();   
            }
    
     public void avancer()
    {   int ox, oy;
        ox=x;
        oy=y;
        String coul = couleur.toLowerCase();
            switch(direction) {
                case 0:
                    if (trace) CanvasTortue.ecrisHorizontal(x, y, coul);
                    x++;
                    break;
                case 1:
                    if (trace) CanvasTortue.ecrisVertical(x, y, coul);
                    y++;
                    break;
                case 2:
                    x--;
                    if (trace) CanvasTortue.ecrisHorizontal(x, y, coul);
                    break;
                case 3:
                    y--;
                    if (trace) CanvasTortue.ecrisVertical(x, y, coul);
            }
        afficherEtat();
        if (trace) afficherSegment(ox,oy,x,y);
    }
    public void tracer() {
        trace = true;
    }    
    public void nePasTracer() {
        trace = false;
    }
    public boolean enTrace() {
        return trace;
    }
    
    // Quelques primitives supplémentaires
    private String rendCouleur(String coul) {
        for (int i=0; i<lesCouleurs.length; i++)
            if (coul.equalsIgnoreCase(lesCouleurs[i]))
              return coul.toUpperCase();
        return "NOIR";
    }
    private void afficheInformation() {
        if (trace) {
            System.out.println("Je suis en " + "x:" + x + " y:" + y);
            System.out.println("J'avance vers " + direction);
            System.out.println("En ecrivant avec cette couleur " + couleur);
        }
    }
    
    public void afficherSegment(int ox, int oy, int x, int y)
    {
     System.out.println("segment (" + ox + ", " + oy + "), (" + x + ", " + y + ")");  
    }
}