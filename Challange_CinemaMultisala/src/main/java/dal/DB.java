package dal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.Sala;
import model.Spettacolo;
import model.Utente;
import model.UtentePrivato;
import model.Admin;

public class DB {
	static Sala s1 = new Sala();
	static Sala s2 = new Sala();
	static Sala s3 = new Sala();
	static Sala s4 = new Sala();
	
	
	public static List<Spettacolo> spettacoli = new ArrayList<Spettacolo>(
			Arrays.asList(
					new Spettacolo(LocalDate.of(2022, 2, 7), "SPIDER-MAN: NO WAY HOME" , "https://www.youtube.com/watch?v=vPgPGC8HGpc","A bigger, bolder Spider-Man sequel, No Way Home expands the franchise's scope and stakes without losing sight of its humor and heart.",s1),
					new Spettacolo(LocalDate.of(2022, 2, 7), "IN THE HEIGHTS" , "https://www.youtube.com/watch?v=vPgPGC8HGpc","Lights up for In the Heights, a joyous celebration of heritage and community fueled by dazzling direction and singalong songs.",s2),
					new Spettacolo(LocalDate.of(2022, 2, 7), "SUMMER OF SOUL" , "https://www.youtube.com/watch?v=vPgPGC8HGpc","Deftly interweaving incredible live footage with a series of revealing interviews, Summer of Soul captures the spirit and context of a watershed moment while tying it firmly to the present.",s3),
					new Spettacolo(LocalDate.of(2022, 2, 7), "PIG" , "https://www.youtube.com/watch?v=vPgPGC8HGpc","Like the animal itself, Pig defies the hogwash of expectations with a beautiful odyssey of loss and love anchored by Nicolas Cage's affectingly raw performance.",s4),
					new Spettacolo(LocalDate.of(2022, 2, 8), "THE POWER OF THE DOG" , "https://www.youtube.com/watch?v=vPgPGC8HGpc","Brought to life by a stellar ensemble led by Benedict Cumberbatch, The Power of the Dog reaffirms writer-director Jane Campion as one of her generation's finest filmmakers.",s1),
					new Spettacolo(LocalDate.of(2022, 2, 8), "CODA" , "https://www.youtube.com/watch?v=vPgPGC8HGpc","CODA's story offers few surprises, but strong representation and a terrific cast -- led by Emilia Jones' brilliant performance -- bring this coming-of-age story vividly to life.",s2),
					new Spettacolo(LocalDate.of(2022, 2, 8), "RAYA AND THE LAST DRAGON" , "https://www.youtube.com/watch?v=vPgPGC8HGpc","Another gorgeously animated, skillfully voiced entry in the Disney canon, Raya and the Last Dragon continues the studio's increased representation while reaffirming that its classic formula is just as reliable as ever.",s3),
					new Spettacolo(LocalDate.of(2022, 2, 8), "WEST SIDE STORY" , "https://www.youtube.com/watch?v=vPgPGC8HGpc","Steven Spielberg's West Side Story presents a new look at the classic musical that lives up to its beloved forebear -- and in some respects might even surpass it.",s4),
					new Spettacolo(LocalDate.of(2022, 2, 9), "A QUIET PLACE PART II" , "https://www.youtube.com/watch?v=vPgPGC8HGpc","A nerve-wracking continuation of its predecessor, A Quiet Place Part II expands the terrifying world of the franchise without losing track of its heart.",s1),
					new Spettacolo(LocalDate.of(2022, 2, 9), "THE MITCHELLS VS. THE MACHINES" , "https://www.youtube.com/watch?v=vPgPGC8HGpc","Eye-catching and energetic, The Mitchells vs. the Machines delivers a funny, feel-good story that the whole family can enjoy.",s2),
					new Spettacolo(LocalDate.of(2022, 2, 9), "THE SUICIDE SQUAD" , "https://www.youtube.com/watch?v=vPgPGC8HGpc","Enlivened by writer-director James Gunn's singularly skewed vision, The Suicide Squad marks a funny, fast-paced rebound that plays to the source material's violent, anarchic strengths.",s3),
					new Spettacolo(LocalDate.of(2022, 2, 9), "SHANG-CHI AND THE LEGEND OF THE TEN RINGS" , "https://www.youtube.com/watch?v=vPgPGC8HGpc","Shang-Chi and the Legend of the Ten Rings isn't entirely free of Marvel's familiar formula, but this exciting origin story expands the MCU in more ways than one.",s4),
					new Spettacolo(LocalDate.of(2022, 2, 10), "SHIVA BABY" , "https://www.youtube.com/watch?v=vPgPGC8HGpc","A ruefully funny calling card for debuting director Emma Seligman, Shiva Baby transcends its sitcom setup with strong performances and satisfying insights.",s1),
					new Spettacolo(LocalDate.of(2022, 2, 10), "THE VELVET UNDERGROUND" , "https://www.youtube.com/watch?v=vPgPGC8HGpc","The Velvet Underground takes a fittingly idiosyncratic approach to delivering a rock documentary that captures the band as well as its era.",s2),
					new Spettacolo(LocalDate.of(2022, 2, 10), "THE TRUFFLE HUNTERS" , "https://www.youtube.com/watch?v=vPgPGC8HGpc","The Truffle Hunters explores a world most viewers will know nothing about -- with delightfully savory results.",s3),
					new Spettacolo(LocalDate.of(2022, 2, 10), "QUO VADIS, AIDA?" , "https://www.youtube.com/watch?v=vPgPGC8HGpc","Quo Vadis, Aida? uses one woman's heartbreaking conflict to offer a searing account of war's devastating human toll.",s4),
					new Spettacolo(LocalDate.of(2022, 2, 11), "LUCA" , "https://www.youtube.com/watch?v=vPgPGC8HGpc","Slight but suffused with infectious joy, the beguiling Luca proves Pixar can play it safe while still charming audiences of all ages.",s1),
					new Spettacolo(LocalDate.of(2022, 2, 11), "SLALOM" , "https://www.youtube.com/watch?v=vPgPGC8HGpc","Led by Noée Abita's outstanding central performance, Slalom offers a moving account of oppression and abuse in the guise of mentorship.",s2),
					new Spettacolo(LocalDate.of(2022, 2, 11), "DRIVE MY CAR" , "https://www.youtube.com/watch?v=vPgPGC8HGpc","Drive My Car's imposing runtime holds a rich, patiently engrossing drama that reckons with self-acceptance and regret.",s3),
					new Spettacolo(LocalDate.of(2022, 2, 11), "CODED BIAS" , "https://www.youtube.com/watch?v=vPgPGC8HGpc","Clear, concise, and comprehensive, Coded Bias offers a chilling look at largely unseen side effects of modern society's algorithmic underpinnings.",s4),
					new Spettacolo(LocalDate.of(2022, 2, 12), "THE SPARKS BROTHERS" , "https://www.youtube.com/watch?v=vPgPGC8HGpc","Their albums may be cult favorites, but this Edgar Wright-directed documentary offers an introduction to Sparks that has something for everyone.",s1),
					new Spettacolo(LocalDate.of(2022, 2, 12), "PARALLEL MOTHERS" , "https://www.youtube.com/watch?v=vPgPGC8HGpc","A brilliant forum for Penélope Cruz's talent, Parallel Mothers reaffirms the familiar pleasures of Almodóvar's filmmaking while proving he's still capable of growth.",s2),
					new Spettacolo(LocalDate.of(2022, 2, 12), "THE LOST DAUGHTER" , "https://www.youtube.com/watch?v=vPgPGC8HGpc","A strikingly assured debut for writer-director Maggie Gyllenhaal, The Lost Daughter unites a brilliant cast in service of a daringly ambitious story.",s3),
					new Spettacolo(LocalDate.of(2022, 2, 12), "MAYOR" , "https://www.youtube.com/watch?v=vPgPGC8HGpc","A clear-eyed look at an extraordinary subject, Mayor makes essential viewing out of one politician's quest to preserve dignity in the midst of bureaucracy.",s4),
					new Spettacolo(LocalDate.of(2022, 2, 13), "TWO OF US" , "https://www.youtube.com/watch?v=vPgPGC8HGpc","A remarkable feature debut for director/co-writer Filippo Meneghetti, Two of Us tells a deceptively complex love story while presenting a rich acting showcase for its three leads.",s1),
					new Spettacolo(LocalDate.of(2022, 2, 13), "MASS" , "https://www.youtube.com/watch?v=vPgPGC8HGpc","Mass requires a lot of its audience, but rewards that emotional labor with a raw look at grief that establishes writer-director Fran Kranz as a filmmaker of tremendous promise.",s2),
					new Spettacolo(LocalDate.of(2022, 2, 13), "LUZZU" , "https://www.youtube.com/watch?v=vPgPGC8HGpc","Beautifully filmed and emotionally impactful, Luzzu uses one man's story to capture the struggles of a region at a cultural crossroads.",s3),
					new Spettacolo(LocalDate.of(2022, 2, 13), "CHANGING THE GAME" , "https://www.youtube.com/watch?v=vPgPGC8HGpc","Urgent and empathetic, Changing the Game takes an affecting and admirably nuanced look at young transgender athletes.",s4)
			));
	
	public static List<Utente> utenti = new ArrayList<>(
			Arrays.asList(
					new Admin("Alexis", "Taveras", "Cinghiale97"),
					new Admin("Giuseppe", "Garone", "easypassword#$#$"),
					new UtentePrivato("Clark", "Kent", "Nonsonosuperman88"),
					new UtentePrivato("Giovanni", "Volo", "morandivolante55")
	));
	
	public static List<Spettacolo> getSpettacoli() {
		return spettacoli;
	}
	
	public static List<Utente> getUtenti() {
		return utenti;
	}
}
