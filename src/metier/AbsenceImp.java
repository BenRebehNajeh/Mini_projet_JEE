package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.*;

public class AbsenceImp implements AbsenceInterface {

    @Override
    public List<Etudiant> listAbsences() {
        List<Etudiant> absences = new ArrayList<>();
        Connection conn = DBConnexion.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Etudiant");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Etudiant etudiant = new Etudiant();
                etudiant.setIdPersonne(rs.getInt("idPersonne"));
                etudiant.setNom(rs.getString("nom"));
                absences.add(etudiant);
            }
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return absences;
    }

    @Override
    public void deleteAbsence(int id) {
        Connection conn = DBConnexion.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM Absence WHERE id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Matiere> listMatiere() {
        List<Matiere> matieres = new ArrayList<>();
        Connection conn = DBConnexion.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Matiere");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Matiere matiere = new Matiere();
                matiere.setIdMatiere(rs.getInt("idMatiere"));
                matiere.setLibMat(rs.getString("libMat"));
                matieres.add(matiere);
            }
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return matieres;
    }

    @Override
    public List<Seance> listSeance() {
        List<Seance> seances = new ArrayList<>();
        Connection conn = DBConnexion.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Seance");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Seance seance = new Seance();
                seance.setIdseance(rs.getInt("IdSeance"));
                seance.setLibelleseance(rs.getString("libellesence"));
                seances.add(seance);
            }
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return seances;
    }

    @Override
    public List<Groupe> listGoupe() {
        List<Groupe> groupes = new ArrayList<>();
        Connection conn = DBConnexion.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Groupe");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Groupe groupe = new Groupe();
                groupe.setIdgroupe(rs.getInt("Idgroupe"));
                groupe.setLibellegroupe(rs.getString("libellegroupe"));
                groupes.add(groupe);
            }
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return groupes;
    }

	@Override
	public List<Salle> listSalle() {
		List<Salle> sall = new ArrayList<Salle>();

		Connection conn = DBConnexion.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement(" select * from Salle");
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				
				while (rs.next()) {

					Salle u = new Salle();
					u.setIdsalle(rs.getInt("idSalle"));
					u.setLibellesalle(rs.getString("Libellesalle"));

					sall.add(u);
				}
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sall;
	}

	@Override
	public	int createAbsence(Absences a) {
		Connection conn = DBConnexion.getConnection();
	    int generatedId = -1; // Default value in case of an error

	    try {
	        PreparedStatement ps = conn.prepareStatement("INSERT INTO Absence VALUES (0,?,?,?,?,?,?,?);");
	        ps.setString(1, a.getDateJour());
	        ps.setBoolean(2, a.isVerrouille());
	        ps.setBoolean(3, a.isEvaluation());
	        ps.setInt(4, a.getIdseance());
	        ps.setInt(5, a.getIdsalle());
	        ps.setInt(6, a.getIdmatiere());
	        ps.setInt(7, a.getIdgroupe());

	        ps.executeUpdate();

	        ResultSet generatedKeys = ps.getGeneratedKeys();
	        if (generatedKeys.next()) {
	            generatedId = generatedKeys.getInt(1);
	        }

	        generatedKeys.close();
	        ps.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return generatedId;
	}

	@Override
	public List<Etudiant> getListEtudById(int id) {
		List<Etudiant> listetud = new ArrayList<Etudiant>();
		Connection conn = DBConnexion.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement(" select * from Etudiant where idgroupe=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs != null) {

				while (rs.next()) {

					Etudiant u = new Etudiant();
					u.setIdPersonne(rs.getInt("idPersonne"));
					u.setNom(rs.getString("nom"));
					u.setPrenom(rs.getString("prenom"));
					u.setAdresseMail(rs.getString("adresseMail"));
					u.setTel(rs.getString("tel"));
					u.setDateNaissance(rs.getDate("dateNaissance"));
					u.setSexe(rs.getBoolean("sexe"));
					u.setPhoto(rs.getString("photo"));
					u.setNumInscription(rs.getString("numInscription"));

					listetud.add(u);
				}
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listetud;
	}

	@Override
	public Matiere getMatiereDetails(int id) {
		Connection conn = DBConnexion.getConnection();
		Matiere matiere = null;

		try {

		PreparedStatement ps = conn.prepareStatement("SELECT * FROM Matiere WHERE idMatiere = ?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			matiere = new Matiere();
			matiere.setIdMatiere(id);
			matiere.setLibMat(rs.getString("LibMat"));
		}

		rs.close();
		ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return matiere;
	}

	public Groupe getGroupeDetails(int id) {
	    Connection conn = DBConnexion.getConnection();
	    Groupe groupe = null;

	    try {
	        PreparedStatement ps = conn.prepareStatement("SELECT * FROM Groupe WHERE idgroupe = ?");
	        ps.setInt(1, id);
	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {
	            groupe = new Groupe();
	            groupe.setIdgroupe(id);
	            groupe.setLibellegroupe(rs.getString("Libellegroupe"));
	            // Set other Groupe properties based on the columns in the ResultSet
	        }

	        rs.close();
	        ps.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return groupe;
	}

	public Salle getSalleDetails(int id) {
	    Connection conn = DBConnexion.getConnection();
	    Salle salle = null;

	    try {
	        PreparedStatement ps = conn.prepareStatement("SELECT * FROM Salle WHERE idsalle = ?");
	        ps.setInt(1, id);
	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {
	            salle = new Salle();
	            salle.setIdsalle(id);
	            salle.setLibellesalle(rs.getString("Libellesalle"));
	            // Set other Salle properties based on the columns in the ResultSet
	        }

	        rs.close();
	        ps.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return salle;
	}


	@Override
	public Seance getSeanceDetails(int id) {
	    Connection conn = DBConnexion.getConnection();
	    Seance seance = null;

	    try {
	        PreparedStatement ps = conn.prepareStatement("SELECT * FROM Seance WHERE idseance = ?");
	        ps.setInt(1, id);
	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {
	            seance = new Seance();
	            seance.setIdseance(id);
	            seance.setLibelleseance(rs.getString("libellesence"));
	            seance.setHeureDebut(rs.getTime("libellesenceheureDebut"));
	            seance.setHeureFin(rs.getTime("heureFin"));
	            // Set other Seance properties based on the columns in the ResultSet
	        }

	        rs.close();
	        ps.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return seance;
	}
	@Override
	public Etudiant getEtudiantDetails(int id) {
	    Connection conn = DBConnexion.getConnection();
	    Etudiant etu = null;

	    try {
	        PreparedStatement ps = conn.prepareStatement("SELECT * FROM etudiant WHERE idPersonne = ?");
	        ps.setInt(1, id);
	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {
	        	etu = new Etudiant();
	        	etu.setIdPersonne(id);
	        	etu.setNom(rs.getString("nom"));
	        	etu.setPrenom(rs.getString("prenom"));
	            // Set other Seance properties based on the columns in the ResultSet
	        }

	        rs.close();
	        ps.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return etu;
	}

	@Override
	public void createDetailsAbsence(Details a) {
	    Connection conn = DBConnexion.getConnection();

		try {
			PreparedStatement ps = conn.prepareStatement(" insert into datails values (0,?,?,?,?,?)");
			ps.setInt(1,a.getAbsent());
			ps.setDouble(2, a.getNote());
			ps.setString(3, a.getObservations());
		     ps.setBoolean(4, a.isAbsentt());
			ps.setInt(5, a.getIdetudiant());
		

			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public List<AbsenceDetails> getAbsenceDetailsForStudents(List<Integer> studentIds) {
	    Connection conn = DBConnexion.getConnection();
	    List<AbsenceDetails> absenceDetailsList = new ArrayList<>();

	    try {
	        PreparedStatement ps = conn.prepareStatement("SELECT a.*, d.*, m.*, g.*, s.*, sa.*\r\n"
	        		+ "FROM Absence a\r\n"
	        		+ "INNER JOIN datails d ON a.idAbsence = d.absent\r\n"
	        		+ "INNER JOIN Matiere m ON a.idmatiere = m.idmatiere\r\n"
	        		+ "INNER JOIN Groupe g ON a.idgroupe = g.idgroupe\r\n"
	        		+ "INNER JOIN Salle sa ON a.idsalle = sa.idsalle\r\n"
	        		+ "INNER JOIN Seance s ON a.idseance = s.idseance\r\n"
	        		+ "WHERE d.idetudiant = ?");
	        
	        for (Integer studentId : studentIds) {
	            ps.setInt(1, studentId);
	            ResultSet rs = ps.executeQuery();

	            while (rs.next()) {
	                int idAbsence = rs.getInt("idAbsence");
	                String dateJour = rs.getString("dateJour");
	                boolean verrouille = rs.getBoolean("verrouille");
	                boolean evaluation = rs.getBoolean("evaluation");
	                int idseance = rs.getInt("idseance");
	                int idsalle = rs.getInt("idsalle");
	                int idmatiere = rs.getInt("idmatiere");
	                int idgroupe = rs.getInt("idgroupe");
	                int idetudiant = rs.getInt("idetudiant");
	                int iddetailsAbs = rs.getInt("iddetailsAbs");
	                int absent = rs.getInt("absent");
	                double note = rs.getDouble("note");
	                String observations = rs.getString("observations");
	                boolean absentt = rs.getBoolean("absentt");
	                String libmat = rs.getString("LibMat");
	                String libgp = rs.getString("libellegroupe");
	                String libsa = rs.getString("libellesalle");

	                Absences absence = new Absences( dateJour, verrouille, evaluation, idseance, idsalle, idmatiere, idgroupe);
	                Etudiant student =getEtudiantDetails(idetudiant);
	                Details details = new Details(iddetailsAbs, absent, note, observations, absentt,idetudiant);
	                Matiere mat = new Matiere();
	                Groupe gp = new Groupe();
	                Salle sa = new Salle();
	                sa.setLibellesalle(libgp);
	                gp.setLibellegroupe(libgp);
	                sa.setLibellesalle(libsa);
	                mat.setLibMat(libmat);
	                AbsenceDetails absenceDetails = new AbsenceDetails(absence, student, details,sa,gp,mat);
	                absenceDetailsList.add(absenceDetails);
	            }

	            rs.close();
	        }

	        ps.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return absenceDetailsList;
	}
}