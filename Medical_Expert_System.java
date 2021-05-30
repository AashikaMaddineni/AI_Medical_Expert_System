import java.util.Scanner;
public class expert {
	public static void main(String args[]) {
		boolean tag=false;
		String name;
		if(true) {
		Scanner sc=new Scanner(System.in);		
		System.out.println("Hello!!! I am an disease prediction Expert System");		
		System.out.print("What's your name? : ");
		name=sc.nextLine();
		System.out.print("what's your gender?(m/f) : ");
		String sex=sc.nextLine();
		System.out.println("Please answer the following questions to find out the disease and its cure");
		System.out.println("For yes/no type questions kindly type y for yes and n for no");
		System.out.println("When prompted with options, enter space seperated integer values corresponding to all the options which apply to you.");
		System.out.print("Do you suffer from red eyes? yes/no : ");
	    String red_eyes=yes_no(sc.nextLine());
	    System.out.print("Are you suffering from fatigue? yes/no : ");	 
	    String fatigue=yes_no(sc.nextLine());
	    System.out.print("Are you having shortness of breath? yes/no : ");
	    String short_breath=yes_no(sc.nextLine());
	    System.out.print("Are you having loss of appetite? yes/no : ");
	    String appetite_loss=yes_no(sc.nextLine());
	    System.out.print("Do you suffer from fever? Select from options \n 0: None \n 1: Normal Fever \n 2: Low Fever \n 3: High Fever \n Your Choice: ");
	    String fevers = null;
	    int temp=sc.nextInt();
 	    if(temp==0) {
 	    	fevers="no";
 	    }
 	    if(temp==1) {
 	    	fevers="Normal_Fever";
 	    }
 	    if(temp==2) {
 	    	fevers="Low_Fever";
 	    }
 	   if(temp==3) {
	    	fevers="High_Fever";
	    }
 	    System.out.println(fevers);
 	    sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?"); 
	    
	    String joint_pains = null, vomits = null;	
		if(appetite_loss.equals("yes") && (fevers.equals("no")) && short_breath.equals("no") && fatigue.equals("no")) {
	    	System.out.print("Are you having any joint pains? yes/no : ");
	 	    joint_pains=yes_no(sc.nextLine());	 	
	 	    System.out.print("Do you suffer from Vomitings? Select from options \n 0: None \n 1: Normal Vomiting \n 2: Severe Vomiting \n Your Choice: ");
	 	     temp=sc.nextInt();
	 	    if(temp==0) {
	 	    	vomits="no";
	 	    }
	 	    if(temp==1) {
	 	    	vomits="Normal_Vomiting";
	 	    }
	 	    if(temp==2) {
	 	    	vomits="Severe_Vomiting";
	 	    }
	 	    System.out.println(vomits);
	 	    sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?"); 
	    }
	    
	    String stiff_joint, swell_joint, red_skin_around_joint, decreased_range, tired = null;
		if(fatigue.equals("no") && short_breath.equals("no") &&  appetite_loss.equals("yes") && (fevers.equals("no"))  && joint_pains.equals("yes")) {
			System.out.print("Are you having stiff_joint? yes/no : ");
			stiff_joint=yes_no(sc.nextLine());
	 	    System.out.print("Are you experiencing swelly Joints? yes/no : ");
	 	    swell_joint=yes_no(sc.nextLine());
	 	    System.out.print("Did the skin turn red around the Joints? yes/no : ");
	 	    red_skin_around_joint=yes_no(sc.nextLine());
	 	    System.out.print("Did the range of motion decrease at the Joints? yes/no : ");
	 	    decreased_range=yes_no(sc.nextLine());	 	    
	 	    System.out.print("Are you feeling tired even if you walk small distance? yes/no : ");
	 	    tired=yes_no(sc.nextLine());	 	  
	 	    String arr[]= {stiff_joint, swell_joint, red_skin_around_joint, decreased_range, tired};
	 	    int count=0;
	 	    for(int i=0;i<arr.length;i++){
	            if(arr[i].equals("yes"))
	                count+=1;
	 	    }
	 	    if(count>=3) {
	 	    	String symptoms[] = {"Stiff joints", "Swelling in joints", "Joint Pains", "Red shik around joints", "Tiredness", "Reduced Movement near joints", "Appetite loss"};
	 	    	suggest_disease("Arthritis", symptoms);	 
	 	    	tag=true;
	 	    }	 	  
		}
		
	String nausea = null, fullness, bloating, abdominal_pain = null, indigestion, gnawing;
	if(fatigue.equals("no") && short_breath.equals("no") &&  appetite_loss.equals("yes") && (fevers.equals("no"))  && vomits.equals("Normal_Vomiting")) {
		System.out.print("Are you having a feeling of vomiting(Nausea)? yes/no : ");
	   nausea=yes_no(sc.nextLine());
 	    System.out.print("Are you having a feeling of fullness in your upper abdomen? yes/no : ");
 	   fullness=yes_no(sc.nextLine());
 	    System.out.print("Are you feeling bloating in your abdomen? yes/no : ");
 	   bloating=yes_no(sc.nextLine());
 	    System.out.print("Are you having pain near abdomen? yes/no : ");
 	   abdominal_pain=yes_no(sc.nextLine());	 	    
 	    System.out.print("Are you facing problems of indigestion? yes/no : ");
 	   indigestion=yes_no(sc.nextLine());	
 	    System.out.print("Are you experiencing gnawing or burning ache or pain in your upper abdomen that may become either worse or better with eating? yes/no : ");
 	   gnawing=yes_no(sc.nextLine());
 	  String arr[]= {nausea, fullness, bloating, abdominal_pain, indigestion, gnawing};
	    int count=0;
	    for(int i=0;i<arr.length;i++){
          if(arr[i].equals("yes"))
              count+=1;
	    }
	    if(count>=4) {
	    	String symptoms[] = {"Appetite loss", "Vomiting", "Nausea", "Fullness near abdomen", "Bloating near abdomen", "Abdominal pain", "Indigestion", "Gnawing pain near abdomen"};
	    	suggest_disease("Gastritis", symptoms);	
	    	tag=true;
	    }		
	}
	
	String burning_stomach, mild_nausea,  weight_loss;
	if(fatigue.equals("no") && short_breath.equals("no") &&  appetite_loss.equals("yes") && (fevers.equals("no"))  && vomits.equals("Severe_Vomiting")) {
		System.out.print("Is your stomach has burning sensation? yes/no : ");
	   burning_stomach=yes_no(sc.nextLine());
 	    System.out.print("Are you having a feeling of fullness, bloating or belching? yes/no : ");
 	   bloating=yes_no(sc.nextLine());
 	    System.out.print("Are you having mild Nausea? yes/no : ");
 	   mild_nausea=yes_no(sc.nextLine());
 	    System.out.print("Did you lose your weight? yes/no : ");
 	   weight_loss=yes_no(sc.nextLine());	 	    
 	    System.out.print("Are you having an intense and localized abdominal pain? yes/no : ");
 	   abdominal_pain=yes_no(sc.nextLine());	
 	 String arr[]= {burning_stomach, bloating, mild_nausea, weight_loss, abdominal_pain};
	    int count=0;
	    for(int i=0;i<arr.length;i++){
          if(arr[i].equals("yes"))
              count+=1;
	    }
	    if(count>=3) {
	    	String symptoms[] = {"Appetite loss", "Severe Vomiting", "Burning sensation in stomach", "Bloated stomach", "Nausea", "Weight loss", "Abdominal pain"};
	    	suggest_disease("Peptic Ulcer", symptoms);	
	    	tag=true;
	    }		
	}
	
	String extreme_thirst = null,extreme_hunger = null,muscle_weakness = null,dizziness = null;
	if(fatigue.equals("yes") && short_breath.equals("no") && fevers.equals("no") ){
		System.out.print("Are you feeling extremely thirsty than before? yes/no : ");
		  extreme_thirst=yes_no(sc.nextLine());
	 	System.out.print("Are you feeling extremely hungry than before? yes/no : ");
	 	   extreme_hunger=yes_no(sc.nextLine());
	 	System.out.print("Are your muscles weaker than berfore? yes/no : ");
	 	   muscle_weakness=yes_no(sc.nextLine());
	    System.out.print("Are you feeling dizzy? yes/no : ");
	       dizziness=yes_no(sc.nextLine());		
	}
	
	String sores, frequent_urination, irratabiliry,  blurred_vision, frequent_infections;
	if(fatigue.equals("yes") && short_breath.equals("no")  && fevers.equals("no")  && extreme_thirst.equals("yes") && extreme_hunger.equals("yes")) {
		System.out.print("Is your Urination more frequent than before? yes/no : ");
		 frequent_urination=yes_no(sc.nextLine());
	 	System.out.print("Did you lose your weight unintentionally? yes/no : ");
	 	  weight_loss=yes_no(sc.nextLine());
	 	System.out.print("Are you more irritable now a days? yes/no : ");
	 	  irratabiliry=yes_no(sc.nextLine());
	    System.out.print("Did your vision get blurred? yes/no : ");
	      blurred_vision=yes_no(sc.nextLine());	
	    System.out.print("Are you having frequent infections such as gums or skin infections? yes/no : ");
	      frequent_infections=yes_no(sc.nextLine());
	    System.out.print("Are your sores healing slowly? yes/no : ");		   
	       sores=yes_no(sc.nextLine());	
	       String arr[]= {frequent_urination, weight_loss, irratabiliry, blurred_vision, frequent_infections, sores};
		    int count=0;
		    for(int i=0;i<arr.length;i++){
	          if(arr[i].equals("yes"))
	              count+=1;
		    }
		    if(count>=4) {
		    	String symptoms[] = {"Fatigue", "Extreme thirst", "Extreme hunger", "Weight loss", "Blurred vision", "Frequent infections", "Frequent urination", "Irritability", "Slow healing of sores"};
		    	suggest_disease("Diabetes", symptoms);	 
		    	tag=true;
		    }
	}
	
	String dark_urine,less_frequent_urination,lethargy,dry_mouth;
	if(fatigue.equals("yes") && short_breath.equals("no")  && fevers.equals("no")  && extreme_thirst.equals("yes") && dizziness.equals("yes")) {
		System.out.print("Are you having less frequent urination? yes/no : ");
		less_frequent_urination=yes_no(sc.nextLine());
	 	System.out.print("Did the urine become dark? yes/no : ");
	 	dark_urine=yes_no(sc.nextLine());
	 	System.out.print("Are you feeling lethargic? yes/no : ");
	 	lethargy=yes_no(sc.nextLine());
	    System.out.print("Is your mouth considerably dry? yes/no : ");
	    dry_mouth=yes_no(sc.nextLine());
	    String arr[]= {less_frequent_urination, dark_urine, lethargy, dry_mouth};
	    int count=0;
	    for(int i=0;i<arr.length;i++){
          if(arr[i].equals("yes"))
              count+=1;
	    }
	    if(count>=2) {
	    	String symptoms[] = {"Fatigue", "Extreme thirst", "Dizziness", "Dark urine", "Lethargic feeling", "Dry mouth", "Less frequent urination"};
	    	suggest_disease("Dehydration", symptoms);	
	    	tag=true;
	    }
	}
	
	    String depression,constipation,feeling_cold, dry_skin, dry_hair,weight_gain, decreased_sweating, slowed_heartrate,pain_joints, hoarseness;
	    if(fatigue.equals("yes") && short_breath.equals("no")  && fevers.equals("no")  && muscle_weakness.equals("yes")) {
	    	System.out.print("Are you feeling depressed now a days? yes/no : ");
	    	depression=yes_no(sc.nextLine());
		 	System.out.print("Are you experiencing constipation? yes/no : ");
		    constipation=yes_no(sc.nextLine());
		 	System.out.print("Are you feeling cold? yes/no : ");
		 	feeling_cold=yes_no(sc.nextLine());
		    System.out.print("Has your skin became drier? yes/no : ");
		    dry_skin=yes_no(sc.nextLine());	
		    System.out.print("Is your hair too becoming dry and also thinner? yes/no : ");
		    dry_hair=yes_no(sc.nextLine());
		 	System.out.print("Did you gain your weight considerably? yes/no : ");
		 	weight_gain=yes_no(sc.nextLine());
		 	System.out.print("Are you not sweating much as earlier? yes/no : ");
		 	decreased_sweating=yes_no(sc.nextLine());
		    System.out.print("Did your heart rate slow down? yes/no : ");
		    slowed_heartrate=yes_no(sc.nextLine());
		 	System.out.print("Are you experiencing pain and stiffness in joints? yes/no : ");
		 	pain_joints=yes_no(sc.nextLine());
		    System.out.print("Is your voice changing abnormally? yes/no : ");
		    hoarseness=yes_no(sc.nextLine());
		    String arr[]= {depression, constipation, feeling_cold, dry_skin, dry_hair, weight_gain, decreased_sweating, slowed_heartrate, pain_joints, hoarseness};
		    int count=0;
		    for(int i=0;i<arr.length;i++){
	          if(arr[i].equals("yes"))
	              count+=1;
		    }
		    if(count>=7) {
		    	String symptoms[] = {"Fatigue", "Muscle weakness", "Depression", "Constipation", "Cold feeling", "Dry skin", "Dry hair", "Weight gain", "Decreased sweating", "Slow heart rate", "Joint pains", "Hoarseness in voice"};
		    	suggest_disease("Hypothyroidism", symptoms);	
		    	tag=true;
		    }
	    }
	    
	    String back_joint_pain = null, chest_pain = null,cough = null, headache = null, pain_arms = null;
		if(fatigue.equals("yes") && short_breath.equals("yes") && fevers.equals("no")){
			System.out.print("Are you having back and joint pain? yes/no : ");
			  back_joint_pain=yes_no(sc.nextLine());
		 	System.out.print("Are you having chest pain? yes/no : ");
		 	  chest_pain=yes_no(sc.nextLine());
		 	System.out.print("Are you having cough frequently? yes/no : ");
		 	  cough=yes_no(sc.nextLine());	
		    System.out.print("Are you having headache? yes/no : ");
		      headache=yes_no(sc.nextLine());
		    System.out.print("Are you having pain in arms and shoulders? yes/no : ");
		      pain_arms=yes_no(sc.nextLine());
		}
		
		String heaviness, burning, sweating;
		if(fatigue.equals("yes") && short_breath.equals("yes") && fevers.equals("no") && chest_pain.equals("yes")  && pain_arms.equals("yes") ){
			System.out.print("Did you have feeling of heaviness or tightness, usually in the centre of the chest, which may spread to the arms, neck, jaw, back or stomach? yes/no : ");
			 heaviness=yes_no(sc.nextLine());
		 	System.out.print("Are you sweating frequently? yes/no : ");
		 	 sweating=yes_no(sc.nextLine());
		 	System.out.print("Are you feeling dizzy? yes/no : ");
		 	 dizziness=yes_no(sc.nextLine());	
		    System.out.print("Do you feel burning sensation near heart? yes/no : ");
		      burning=yes_no(sc.nextLine());
		    
		    String arr[]= {heaviness, sweating, dizziness, burning};
			    int count=0;
			    for(int i=0;i<arr.length;i++){
		          if(arr[i].equals("yes"))
		              count+=1;
			    }
			    if(count>=2) {
			    	String symptoms[] = {"Shortness in breath", "Chest pain", "Fatigue", "Arm pains", "Heaviness", "Sweating", "Diziness", "Burning sensation near heart"};
			    	suggest_disease("Coronary Arteriosclerosis", symptoms);	
			    	tag=true;
			    }			
		}
	 
		String snoring, sudden_physical, isolated, confidence;
		if(short_breath.equals("yes") && fevers.equals("no") && back_joint_pain.equals("yes")){
			System.out.print("Are you sweating more than normal? yes/no : ");
			  sweating=yes_no(sc.nextLine());
		 	System.out.print("Did you develop a habit of snoring? yes/no : ");
		 	  snoring=yes_no(sc.nextLine());
		 	System.out.print("Are you not able to cope up with sudden physical activity? yes/no : ");
		 	  sudden_physical=yes_no(sc.nextLine());	
		    System.out.print("Are you feeling tired every day withour doing much work? yes/no : ");
		       tired=yes_no(sc.nextLine());
		    System.out.print("Are you feeling isolated? yes/no : ");
		      isolated=yes_no(sc.nextLine());
		    System.out.print("Are you having low confidence and self esteem in day to day activities? yes/no : ");
		      confidence=yes_no(sc.nextLine());
		      String arr[]= {sweating, snoring, sudden_physical, tired, isolated, confidence};
			    int count=0;
			    for(int i=0;i<arr.length;i++){
		          if(arr[i].equals("yes"))
		              count+=1;
			    }
			    if(count>=4) {
			    	String symptoms[] = {"Shortness in breath", "Back and Joint pains", "High sweating", "Snoring habit", "Tireness", "Low confidence"};
			    	suggest_disease("Obesity", symptoms);	 
			    	tag=true;			    	
			    }				    
		}
	
		
		String irregular_heartbeat, weakness, pale_skin, lightheadedness, cold_hands_feet;
		if(fatigue.equals("yes") && short_breath.equals("yes") && fevers.equals("no") && chest_pain.equals("yes") &&  headache.equals("yes") ){
			System.out.print("Are you experiencing irregular heartbeat? yes/no : ");
			  irregular_heartbeat=yes_no(sc.nextLine());
		 	System.out.print("Are you feeling weak? yes/no : ");
		 	  weakness=yes_no(sc.nextLine());
		 	System.out.print("Has your skin turned pale or yellowish? yes/no : ");
		 	  pale_skin=yes_no(sc.nextLine());	
		    System.out.print("Are you having dizziness or light headedness? yes/no : ");
		      lightheadedness=yes_no(sc.nextLine());
		    System.out.print("Are you having cold hands and feet? yes/no : ");
		      cold_hands_feet=yes_no(sc.nextLine());
		    String arr[]= {irregular_heartbeat, weakness, pale_skin, lightheadedness, cold_hands_feet};
			    int count=0;
			    for(int i=0;i<arr.length;i++){
		          if(arr[i].equals("yes"))
		              count+=1;
			    }
			    if(count>=3) {
			    	String symptoms[] = {"Shortness in breath", "Chest pain", "Fatigue", "Headache", "Irregular heartbeat", "Weakness", "Pale skin", "Dizziness", "Cold limbs"};
			    	suggest_disease("Anemia", symptoms);
			    	tag=true;
			    }			
		}
		
		
		
		String Wheezing, sleep_trouble;
		if(short_breath.equals("yes") && fevers.equals("no") && chest_pain.equals("yes") && cough.equals("yes")){
			System.out.print("Are you having a whistling or wheezing sound when exhaling? yes/no : ");
			  Wheezing=yes_no(sc.nextLine());
		 	System.out.print("Are you having trouble sleeping caused by shortness of breath, coughing or wheezing? yes/no : ");
		 	  sleep_trouble=yes_no(sc.nextLine());		 		    
		    String arr[]= {Wheezing, sleep_trouble};
			    int count=0;
			    for(int i=0;i<arr.length;i++){
		          if(arr[i].equals("yes"))
		              count+=1;
			    }
			    if(count>=1) {
			    	String symptoms[] = {"Shortness in breath", "Chest pain", "Cough", "Wheezing sound when exhaling", "Trouble sleep because of coughing or wheezing"};
			    	suggest_disease("Asthma", symptoms);	
			    	tag=true;
			    }			
		}
		
		String eyes_pain, muscle_pain, joint_pain, rashes = null, bleeding;
		if(fevers.equals("High_Fever")){
			System.out.print("Are you experiencing severe headache? yes/no : ");
			  headache=yes_no(sc.nextLine());
		 	System.out.print("Are you having pain behind eyes? yes/no : ");
		 	  eyes_pain=yes_no(sc.nextLine());
		 	System.out.print("Are you having severe muscle pain? yes/no : ");
		 	  muscle_pain=yes_no(sc.nextLine());	
		    System.out.print("Are you having severe joint pain? yes/no : ");
		      joint_pain=yes_no(sc.nextLine());
		    System.out.print("Have you vomited or felt like vomiting(Nausea) yes/no : ");
		      nausea=yes_no(sc.nextLine());
		    System.out.print("Have you experienced rashes on skin which appears two to five days after the onset of fever? yes/no : ");
		      rashes=yes_no(sc.nextLine());
			System.out.print("Are you having mild bleeding such a nose bleed, bleeding gums, or easy bruising? yes/no : ");
			  bleeding=yes_no(sc.nextLine());
			  String arr[]= {headache, eyes_pain, muscle_pain, joint_pain, nausea, rashes, bleeding};
			    int count=0;
			    for(int i=0;i<arr.length;i++){
		          if(arr[i].equals("yes"))
		              count+=1;
			    }
			    if(count>=5) {
			    	String symptoms[] = {"High fever", "Headache", "Eye pain", "Muscle pain", "Joint pains", "Nausea", "Rashes", "Bleeding"};
			    	suggest_disease("Dengue", symptoms);
			    	tag=true;
			    }
		}
		
		String wheezing,  chills = null, chest_tightness, sore_throat = null,  body_aches, breathlessness, nose_blocked;
		if(fevers.equals("Low_Fever")){
			System.out.print("Are you having a persistent cough, which may produce yellow grey mucus (phlegm)? yes/no : ");
			 cough=yes_no(sc.nextLine());
		 	System.out.print("Are you experiencing Wheezing? yes/no : ");
		 	  wheezing=yes_no(sc.nextLine());
		 	System.out.print("Are you experiencing chills? yes/no : ");
		 	 chills=yes_no(sc.nextLine());	
		    System.out.print("Are you having a feeling of tightness in the chest? yes/no : ");
		     chest_tightness=yes_no(sc.nextLine());
		    System.out.print("Are you having a sore throat? yes/no : ");
		    sore_throat=yes_no(sc.nextLine());
		    System.out.print("Are you having body pains? yes/no : ");
		     body_aches=yes_no(sc.nextLine());
			System.out.print("Are you experiencing breathlessness? yes/no : ");
			breathlessness=yes_no(sc.nextLine());
			System.out.print("Are you having headache? yes/no : ");
			 headache=yes_no(sc.nextLine());
			System.out.print("Are you having a blocked nose or sinuses? yes/no : ");
			 nose_blocked=yes_no(sc.nextLine());
			  String arr[]= {headache, cough, wheezing, chills, chest_tightness, sore_throat, body_aches, breathlessness, nose_blocked};
			    int count=0;
			    for(int i=0;i<arr.length;i++){
		          if(arr[i].equals("yes"))
		              count+=1;
			    }
			    if(count>=7) {
			    	String symptoms[] = {"Slight Fever", "Cough", "Wheezing", "Chills in body", "Tightness in chest", "Sore throat", "Body aches", "Headache", "Breathlessness", "Blocke nose"};
			    	suggest_disease("Bronchitis", symptoms);
			    	tag=true;
			    }
		}
		
		
		String eye_burn,  eye_crusting, eye_irritation = null;
		if(red_eyes.equals("yes")){
			System.out.print("Do you have a burning sensation in eyes? yes/no : ");
			eye_burn=yes_no(sc.nextLine());
		 	System.out.print("Do you get pus or crusting on eyes? yes/no : ");
		 	eye_crusting=yes_no(sc.nextLine());
		 	System.out.print("Do you have eye irritation? yes/no : ");
		 	eye_irritation=yes_no(sc.nextLine());			    
		 	 if(eye_burn.equals("yes") || eye_crusting.equals("yes")){
				String symptoms[] = {"Burning sensation in eyes", "Crusting of eyes", "Redness in eyes"};
				suggest_disease("Eye Conjunctivitis", symptoms);
		    	tag=true;
		     }
		 	 
			 if(eye_burn.equals("no") && eye_crusting.equals("no") && eye_irritation.equals("yes")){
					String symptoms[] = {"Irritation in eyes", "Redness in eyes"};
					suggest_disease("Eye Allergy", symptoms);
			    	tag=true;
			  }
		}
			
		
		if(fevers.equals("Normal_Fever")){
			System.out.print("Are you suffering from chest pain? yes/no : ");
			 chest_pain=yes_no(sc.nextLine());
		 	System.out.print("Are you suffering from abdominal pain? yes/no : ");
		 	  abdominal_pain=yes_no(sc.nextLine());
		 	System.out.print("Are you suffering from sore throat? yes/no : ");
		 	  sore_throat=yes_no(sc.nextLine());	
		    System.out.print("Are you having shaking chills? yes/no : ");
		      chills=yes_no(sc.nextLine());
		    System.out.print("Are you suffering from rashes on skin? yes/no : ");
		      rashes=yes_no(sc.nextLine());
		    System.out.print("Did you vomit or feel like vomiting(Nausea) yes/no : ");
		      nausea=yes_no(sc.nextLine());
		}
		
		String  persistent_cough,night_sweats, cough_blood;
		if( fatigue.equals("yes") && fevers.equals("Normal_Fever") && chest_pain.equals("yes")  && chills.equals("yes")){
			System.out.print("Are you experiencing persistent cough which lasted for more than 2 to 3 weeks? yes/no : ");
			 persistent_cough=yes_no(sc.nextLine());	
		    System.out.print("Did you experience unintentional weight loss? yes/no : ");
		     weight_loss=yes_no(sc.nextLine());
		    System.out.print("Are you experiencing Night Sweats? yes/no : ");
		     night_sweats=yes_no(sc.nextLine());
		    System.out.print("Are you coughing up blood? yes/no : ");
		     cough_blood=yes_no(sc.nextLine());
		     String arr[]= {persistent_cough, weight_loss,night_sweats, cough_blood};
			    int count=0;
			    for(int i=0;i<arr.length;i++){
		          if(arr[i].equals("yes"))
		              count+=1;
			    }
			    if(count>=2) {
			    	String symptoms[] = {"fever", "chest pain", "fatigue", "loss of appetite","persistent cough"};
			    	suggest_disease("Tuberculosis", symptoms);	
			    	tag=true;
			    }
		}
		
		String dry_cough,  muscle_ache, nasal_congestion;
		if(fevers.equals("Normal_Fever") && fatigue.equals("yes") && sore_throat.equals("yes") ){
			System.out.print("Are you experiencing weakness? yes/no : ");
			 weakness=yes_no(sc.nextLine());	
		    System.out.print("Are you having dry persistent cough? yes/no : ");
		     dry_cough=yes_no(sc.nextLine());
		    System.out.print("Are you having aching muscles, especially in your back, arms and legs? yes/no : ");
		     muscle_ache=yes_no(sc.nextLine());
		    System.out.print("Are you experiencing sweats along with chills? yes/no : ");
		     chills=yes_no(sc.nextLine());
		    System.out.print("Are you experiencing nasal congestion? yes/no : ");
		     nasal_congestion=yes_no(sc.nextLine());
		    System.out.print("Are you experiencing headache? yes/no : ");
		     headache=yes_no(sc.nextLine());
		     String arr[]= {weakness, dry_cough, muscle_ache, chills, nasal_congestion, headache};
			    int count=0;
			    for(int i=0;i<arr.length;i++){
		          if(arr[i].equals("yes"))
		              count+=1;
			    }
			    if(count>=4) {
			    	String symptoms[] = {"Fever", "Fatigue", "Sore throat", "Weakness", "Dry cough", "Muscle aches", "Chills", "Nasal congestion", "Headache"};
			    	suggest_disease("Influenza", symptoms);	
			    	tag=true;
			    }		
				
		}
		
		
		String flu_like, pale_stool, jaundice;
		if(fevers.equals("Normal_Fever") && fatigue.equals("yes") && abdominal_pain.equals("yes") ){
			System.out.print("Are you experiencing flu like symptoms? yes/no : ");
			  flu_like=yes_no(sc.nextLine());	
		    System.out.print("Are you getting dark urine? yes/no : ");
		      dark_urine=yes_no(sc.nextLine());
		    System.out.print("Are you having pale stool? yes/no : ");
		      pale_stool=yes_no(sc.nextLine());
		    System.out.print("Are you experiencing unexplained weight loss? yes/no : ");
		      weight_loss=yes_no(sc.nextLine());
		    System.out.print("Are your skin and eyes turning yellow? yes/no : ");
		     jaundice=yes_no(sc.nextLine());
		     String arr[]= {flu_like, dark_urine, pale_stool, weight_loss, jaundice};
			    int count=0;
			    for(int i=0;i<arr.length;i++){
		          if(arr[i].equals("yes"))
		              count+=1;
			    }
			    if(count>=3) {
			    	String symptoms[] = {"Fever", "Fatigue", "Abdominal pain", "Flu like symptoms", "Dark urine", "Pale stool", "Weight loss", "Yellow eyes and skin(Jaundice)"};
			    	suggest_disease("Hepatitis", symptoms);	 	 
			    	tag=true;
			    }				    			
		}
		
		String sweat, rapid_breath, diarrhea;
		if(fevers.equals("Normal_Fever") && short_breath.equals("yes") && chest_pain.equals("yes") && nausea.equals("yes") ){
			System.out.print("Are you experiencing shortness of breath while doing normal activities or even while resting? yes/no : ");
			   short_breath=yes_no(sc.nextLine());	
		    System.out.print("Are you experiencing sweating along with chills? yes/no : ");
		       sweat=yes_no(sc.nextLine());
		    System.out.print("Are you breathing rapidly? yes/no : ");
		      rapid_breath=yes_no(sc.nextLine());
		    System.out.print("Are you having a worsening cough that may produce yellow/green or bloody mucus (phlegm) yes/no : ");
		      cough=yes_no(sc.nextLine());
		    System.out.print("Are you experiencing Diarrhea? yes/no : ");
		     diarrhea=yes_no(sc.nextLine());
		     String arr[]= {short_breath, sweat, rapid_breath, cough, diarrhea};
			    int count=0;
			    for(int i=0;i<arr.length;i++){
		          if(arr[i].equals("yes"))
		              count+=1;
			    }
			    if(count>=3) {
			    	String symptoms[] = {"Fever", "Chest pain", "Shortness in breath", "Nausea", "Sweating with chills", "Rapid breathing", "Cough with phlegm", "Diarrhea"};
			    	suggest_disease("Pneumonia", symptoms);	 
			    	tag=true;
			    }				    			
		}
		
		String back_pain;
		if(fevers.equals("Normal_Fever") && abdominal_pain.equals("yes") && chills.equals("yes") && nausea.equals("yes") ){
			System.out.print("Are you experiencing headache? yes/no : ");
			   headache=yes_no(sc.nextLine());	
		    System.out.print("Are you experiencing sweating frequently? yes/no : ");
		       sweat=yes_no(sc.nextLine());
		    System.out.print("Are you coughing frequently? yes/no : ");
		      cough=yes_no(sc.nextLine());
		    System.out.print("Are you experiencing weakness? yes/no : ");
		      weakness=yes_no(sc.nextLine());
		    System.out.print("Are you having intense muscle pain? yes/no : ");
		      muscle_pain=yes_no(sc.nextLine());
		    System.out.print("Are you having lower back pain? yes/no : ");
		     back_pain=yes_no(sc.nextLine());
		     String arr[]= {headache, sweat, weakness, cough, muscle_pain, back_pain};
			    int count=0;
			    for(int i=0;i<arr.length;i++){
		          if(arr[i].equals("yes"))
		              count+=1;
			    }
			    if(count>=4) {
			    	String symptoms[] = {"Fever", "Chills", "Abdominal pain", "Nausea", "Headache", "Sweating", "Cough", "Weakness", "Muscle pain", "Back pain"};
			    	suggest_disease("Malaria", symptoms);	
			    	tag=true;
			    }				    			
		}

		String  lymph ;
		if(fevers.equals("Normal_Fever") && rashes.equals("yes")){
			System.out.print("Are you experiencing headache? yes/no : ");
			   headache=yes_no(sc.nextLine());	
		    System.out.print("Are you having muscle aches and joint pain? yes/no : ");
		       muscle_ache=yes_no(sc.nextLine());
		    System.out.print("Are you experiencing sore throat and painful mouth sores? yes/no : ");
		       sore_throat=yes_no(sc.nextLine());
		    System.out.print("Are you experiencing swollen lymph glands especially on the neck? yes/no : ");
		      lymph=yes_no(sc.nextLine());
		    System.out.print("Are you experiencing Diarrhea? yes/no : ");
		      diarrhea=yes_no(sc.nextLine());
		    System.out.print("Are you coughing frequently? yes/no : ");
		     cough=yes_no(sc.nextLine());
		    System.out.print("Did you experience unintentional weight loss? yes/no : ");
		     weight_loss =yes_no(sc.nextLine());
		    System.out.print("Are you experiencing Night Sweats? yes/no : ");
		     night_sweats=yes_no(sc.nextLine());
		    String arr[]= {headache, muscle_ache, sore_throat, lymph, diarrhea, cough, weight_loss, night_sweats};
			    int count=0;
			    for(int i=0;i<arr.length;i++){
		          if(arr[i].equals("yes"))
		              count+=1;
			    }
			    if(count>=6) {
			    	String symptoms[] = {"Fever", "Rashes", "Headache", "Muscle ache", "Sore throat", "Swollen lymph nodes", "Diarrhea", "Cough", "Weight loss", "Night sweat"};
			    	suggest_disease("AIDS", symptoms);	 
			    	tag=true;
			    }				    			
		}
		
		String  upper_abdominal_pain, abdominal_eat, hearbeat, oily_stool ;
		if(fevers.equals("Normal_Fever") &&  abdominal_pain.equals("yes")  && chills.equals("no") && nausea.equals("yes") ){
			System.out.print("Are you experiencing upper abdominal pain? yes/no : ");
			  upper_abdominal_pain=yes_no(sc.nextLine());	
		    System.out.print("Is the abdominal pain becoming verse after eating? yes/no : ");
		      abdominal_eat=yes_no(sc.nextLine());
		    System.out.print("Is your heartbeat at high rate? yes/no : ");
		      hearbeat=yes_no(sc.nextLine());
		    System.out.print("Did you experience unintentional weight loss? yes/no : ");
		      weight_loss=yes_no(sc.nextLine());
		    System.out.print("Are you having oily smelly stools? yes/no : ");
		      oily_stool=yes_no(sc.nextLine());		    
		    String arr[]= {upper_abdominal_pain, abdominal_eat, hearbeat, weight_loss, oily_stool};
			    int count=0;
			    for(int i=0;i<arr.length;i++){
		          if(arr[i].equals("yes"))
		              count+=1;
			    }
			    if(count>=3) {
			    	String symptoms[] = {"Nausea", "Fever", "Upper abdominal pain", "Heartbeat", "Weight loss", "Oily and smelly stool"};
			    	suggest_disease("Pancreatitis", symptoms);	
			    	tag=true;
			    }
		}
		
		
		String  lose_smell;
		if(fevers.equals("Normal_Fever") && short_breath.equals("yes") && fatigue.equals("yes") && nausea.equals("yes")){
			System.out.print("Are you having chills sometimes with shaking? yes/no : ");
		    	chills=yes_no(sc.nextLine());	
		    System.out.print("Do you cough frequently? yes/no : ");
		        cough=yes_no(sc.nextLine());
		    System.out.print("Are you having body aches? yes/no : ");
		        body_aches=yes_no(sc.nextLine());
		    System.out.print("Are you experiencing headache? yes/no : ");
		        headache=yes_no(sc.nextLine());
		    System.out.print("Are you experiencing sore throat and painful mouth sores? yes/no : ");
		       sore_throat=yes_no(sc.nextLine());		
		    System.out.print("Did you lose your sense of smell and taste considerably? yes/no : ");
		       lose_smell=yes_no(sc.nextLine());
		    System.out.print("Are you experiencing Diarrhea? yes/no : ");
		       diarrhea=yes_no(sc.nextLine());
		    String arr[]= {chills, body_aches, headache, sore_throat, lose_smell, diarrhea};
			    int count=0;
			    for(int i=0;i<arr.length;i++){
		          if(arr[i].equals("yes"))
		              count+=1;
			    }
			    if(count>=4) {
			    	String symptoms[] = {"Fever", "Fatigue", "Shortness in breath", "Nausea", "Chills", "Cough", "Body aches", "Headache", "Sorethroat", "Diarrhea", "Loose sense of taste/smell"};
			    	suggest_disease("Corona Virus", symptoms);	 
			    	tag=true;
			    }			    
		}
		}
		if(tag==false) {
			 System.out.print("\n Dear "+name+" Sorry!! Kindly check your input data. The symptoms did not match with any of diseases in my database.");
			}
		
	}	
		
	private static void suggest_disease(String disease, String[] symptoms) {
		System.out.print("\nYou might be suffering from "+disease);
		System.out.print("\nThis conclusion is reached because you show symptoms among the following:\n");
		for(int i=0;i<symptoms.length;i++) {
			System.out.println((i+1)+" : "+symptoms[i]);
		}
		System.exit(0);
	}


	

	public static String yes_no(String s) {			
			String ans = s.toLowerCase();			
			        if(ans.equals("y") || ans.equals("yes") || ans.equals("yup")) {
			            ans="yes";
			        }
			        else if(ans.equals("n") || ans.equals("no") || ans.equals("nope")) {
			            ans="no";
			        }
			        else { 
			        	ans = null;  
		           }
			     return ans;
	}
}
