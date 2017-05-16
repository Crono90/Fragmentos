package giovanni.itt.drapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Lista_contenido {

	/** 
	 * Donde se guardan las entradas de la lista.
	 */
	public static ArrayList<Lista_entrada> ENTRADAS_LISTA = new ArrayList<Lista_entrada>();
	
	/** 
	 * Donde se asigna el identificador a cada entrada de la lista
	 */
	public static Map<String, Lista_entrada> ENTRADAS_LISTA_HASHMAP = new HashMap<String, Lista_entrada>();
	
	/** 
	 * Creamos est�ticamente las entradas
	 */
	static {
		aniadirEntrada(new Lista_entrada("0", R.drawable.descarga, "ACNE", " INFORMACIÓN:\n" + "\n" +
				"El acné es una enfermedad inflamatoria cutánea que se" + "produce cuando los folículos pilosos se llenan de grasa y células muertas de la piel. \n"+ "\n" +
		"CAUSAS\n" + "\n" +
				"Principalmente aparecen la adolescencia afectando el 80% debido a una interacción entre hormonas, sebo y bacterias que viven sobre la piel o dentro de ella y también en el cabello. \n" + "\n" +
		"SINTOMAS\n" + "\n" +
				"Se puede manifestar con varios tipos de lesiones pueden ser inflamatorias y no inflamatorias. \n" +
				"Inflamatorias \n" +
				"•\tPápulas rojizas \n" +
				"•\tPústulas \n" +
				"•\tNodulos \n" +
				"•\tQuistes \n" +
				"No inflamatorias \n" +
				"•\tComedones cerrados y abiertos \n" +
				"•\tPuntos negros \n" + "\n"+

				"TRATAMIENTO\n" + "\n" +
				"Inducción de cremas, productos de limpieza, así como antibióticos y alimentación. \n" + "\n" +
				"Medicamentos\n" + "\n" +

				"•\tAntiinflamatorios: \n" +
				"Previene o contrarresta la hinchazón (inflamación) en las articulaciones y los tejidos.\n" + "\n"
+				"•\tAntibiótico:\n" +
				"Detiene el crecimiento de microorganismos en la piel que pueden causar una infección.\n" + "\n"+
				"•\tAntiséptico tópico \n" +
				"Destruye o proviene el crecimiento de microorganismos en la piel que pueden causar una infección \n" + "\n"+
				"Cuidado personal \n" + "\n"+
				"•\tPeróxido de benzoilo, ácido salicílico: \n" +
				"Medicamento de uso tópico que reduce las bacterias que causan el acné y dañan la piel. \n" + "\n"+
				"•\tJabón antibacteriano:\n" +
				"Limpia la piel y reduce el riesgo de infección \n" + "\n" +
				"Alimentación\n" + "\n" +
				"Aunque una determinada dieta no va eliminar el problema, lo más aconsejable es llevar una dieta equilibrada, sin abusar de alimentos grasos, procesados o refinados. \n" + "\n"+
				"•\tVitamina A:\n" +
				"Ayuda al alto poder antinflamatorio es un remedio contra las bacterias que causan el acné.\n" + "\n"+
				"•\tBeta caroteno, vitamina c y vitamina E: \n" +
				"Mantiene la piel sana por su alto contenido de antioxidantes. \n" + "\n"+
				"Especialistas \n" + "\n"+
				"•\tPediatra: \n" +
				"Brinda atención médica a los bebés, niños y adolescentes \n" + "\n" +
				"•\tMedico de atención primaria:\n" +
				"Previene, diagnostica y trata enfermedades \n" + "\n" +
				"•\tDermatólogo: \n" +
				"Es especialista en las enfermedades de la piel, las uñas y el pelo.\n" + "\n"+
				"•\tNutriólogo: \n" +
				"Especialista en alimentación y nutrición \n" +"\n"+
				"Fuente: CCM salud, Luque, A. y Marnet."
		));


        //Brucelosis
		aniadirEntrada(new Lista_entrada("1", R.drawable.brucelosi, "BRUCELOSIS ", "INFORMACION\n" +
                "La brucelosis es una enfermedad producida por el bacilo gram negativo del género Brucella.\n" + "\n"+
        "CAUSAS\n" +
                "La bacteria brúcela puede infectar al ganado vacuno, las cabras, los camellos, los perros y los cerdos. La bacteria se puede diseminar a los humanos si usted entra en contacto con carne infectada o la placenta de animales infectados o si bebe leche o come queso sin pasteurizar.\n" +"\n"+
				"SINTOMAS\n" +
				"•\tFiebre\n" +
				"•\tEscalofríos\n" +
				"•\tFatiga\n" +
				"•\tPérdida de apetito \n" +
				"•\tSudores nocturnos\n" +
				"•\tAdelgazamiento\n" +
				"•\tAdenopatía \n" +
				"•\tDolor de cabeza\n" +
				"•\tTos\n" +
				"•\tÁrea de dolor (abdomen, articulaciones, espalda o músculos).  \n" + " \n"+
		"TRATAMIENTO\n" +
				"Medicamentos\n" +
				"•\tAntibiótico\n" +
				"Detiene el crecimiento de las bacterias o las elimina. \n" + "\n"+
				"Especialistas \n" +
				"•\tInfectologo: \n" +
				"Trata las infecciones, incluidas las de origen tropical \n" +
				"•\tNeurólogo: \n" +
				"Trata los trastornos del sistema nervioso \n" +
				"•\tMédico de atención primaria: \n" +
				"Previene, diagnostica y trata enfermedades.\n" +
				" \n" +
        "Fuente: MedlinePlus, Vega C. y colaboradores. "));

            //Cirosis

        aniadirEntrada(new Lista_entrada("2", R.drawable.cirrosis, "CIROSIS", "INFORMACION\n" +
                "Es una afección en la que el hígado se deteriora lentamente y funciona mal debido a una lesión crónica. El tejido sano del hígado se sustituye por tejido cicatricial, bloqueando parcialmente la circulación de la sangre a través del hígado. La cicatrización también deteriora la capacidad del hígado.\n"+ "\n"+
        "CAUSAS\n" +
                "Las causas más comunes de cirrosis son el consumo abundante de alcohol y la hepatitis C crónica.\n" + "\n"+
        "SINTOMAS\n" +
                "•\tdebilidad\n" +
                "•\tfatiga\n" +
                "•\tpérdida del apetito\n" +
                "•\tnáuseas\n" +
                "•\tvómitos\n" +
                "•\tpérdida de peso\n" +
                "•\tdolor abdominal e hinchazón cuando se acumula líquido en el abdomen\n" +
                "•\tretención de agua \n" +
                "•\tpicazón\n" +
                "•\tvasos sanguíneos en forma de araña cerca de la superficie de la piel.\n" +
                "•\tPiel y ojos amarillos.\n" + "\n"+
        "TRATAMIENTO\n" +
                "Los tratamientos se especializan en la causa subyacente. En los casos avanzados, puede ser necesario hacer un trasplante de hígado.\n" +
                "Medicamentos \n" +
                "•\tDiurético\n" +
                "Aumenta la producción de orina para eliminar el exceso de sal y agua.\n" +
                "•\tReductor de amoniaco \n" +
                "Reduce la cantidad de amoniaco en el cuerpo \n" +
                "•\tBeta bloqueador \n" +
                "Ralentiza el ritmo cardiaco y reduce la presión arterial \n" +
                "•\tAntibiótico\n" +
                "Detiene el crecimiento de bacterias o las elimina. \n" +
                "•\tAntiviral\n" +
                "Reduce la capacidad de los virus para reproducirse. \n" +
                "Cuidado personal \n" +
                "•\tEvitar el alcohol\n" +
                "Puede ser dañino y agravar ciertas afecciones \n" +
                "Alimentación  \n" +
                "•\tDieta baja en sodio \n" +
                "Restricción de sal. \n" +
                "Especialistas \n" +
                "•\tHepatólogo\n" +
                "Es especialista en los trastornos del hígado.\n" +
                "•\tGastroenterólogo\n" +
                "Especialista en el aparato digestivo\n" +
                "•\tMédico de atención primaria \n" +
                "Previene, diagnostica y trata enfermedades.\n" +
                "•\tNutriólogo \n" +
                "Especialista en alimentación y nutrición\n" +
                "•\tEspecialista en medicina de urgencias \n" +
                "Trata los pacientes de urgencias.\n" +
                "\n" + "Fuente: NIH y MedlinePlus"));

			//Diabetis Tipo 2


		aniadirEntrada(new Lista_entrada("3", R.drawable.esquema_diabetes2, "DIABETES TIPO 2", "INFORMACION\n" +
				"Es una enfermedad que dura toda la vida (crónica) en la cual hay un alto nivel de azúcar (glucosa) en la sangre.\n" + "\n"+
		"CAUSAS\n" +
				"Es mayor la frecuencia de diabetes tipo 2 en personas con antecedentes familiares de diabetes. Se han descubierto muchos genes relacionados con el desarrollo de diabetes, aunque este componente genético es complejo y, posiblemente, debe acompañarse de factores ambientales como los hábitos de vida: sedentarismo y alimentación inadecuada.\n" + "\n"+
		"SINTOMAS\n" +
				"•\tInfección en la vejiga, el riñón, la piel u otras infecciones que son más frecuentes o sanan lentamente\n" +
				"•\tFatiga\n" +
				"•\tHambre\n" +
				"•\tAumento de la sed\n" +
				"•\tAumento de la micción\n" +
				"•\tVisión borrosa\n" + "\n"+
		"TRATAMIENTO\n" +
				"Medicamentos \n" +
				"•\tAntidiabético\n" +
				"Controla la cantidad de azúcar (glucosa) en la sangre \n" +
				"•\tAnticoagulantes\n" +
				"Ayuda a prevenir la formación de coágulos o a disolver los coágulos\n" +
				"•\tEstatinas \n" +
				"Disminuye la producción hepática de colesterol dañino \n" +
				"•\tInsulina \n" +
				"Ayuda a controlar la cantidad de azúcar (glucosa) en el torrente sanguíneo. \n" +
				"Cuidado personal \n" +
				"•\tEjercicio físico \n" +
				"Realizar actividad aeróbica durante 20 a 30 minutos, cinco días a la semana mejora la salud cardiovascular. \n" +
				"•\tAdelgazamiento \n" +
				"Puede mejorar la salud cardiovascular y reducir el riesgo de complicaciones relacionadas con la obesidad.\n" +
				"Alimentación \n" +
				"•\tDieta para diabéticos \n" +
				"Dieta que ayuda a controlar el azúcar (glucosa) en la sangre mediante la reducción de azúcar y carbohidratos.\n" +
				"Especialistas \n" +
				"•\tMédico de atención primaria \n" +
				"Previene, diagnostica y trata enfermedades.\n" +
				"•\tNutriólogo \n" +
				"Especialista en alimentación y nutrición. \n" +
				"\n" + "\n"+
				"Fuente: Clínica Universidad de Navarra y MedlinePlus"));

//ESCLEROSIS MULTIPLE

		aniadirEntrada(new Lista_entrada("4", R.drawable.ex, "ESCLEROSIS MULTIPLE", "INFORMACION\n" +
				"Es una enfermedad autoinmunitaria que afecta el cerebro y la médula espinal (sistema nervioso central).\n" +
		"\n"+ "CAUSAS\n" +
				"No se sabe exactamente qué causa la EM. La creencia más frecuente es que los culpables son un virus, un defecto genético, o ambos. Los factores ambientales también pueden jugar un papel importante.\n"+
		"\n"+ "SINTOMAS\n" +
				"Síntomas musculares:\n" +
				"•\tPérdida del equilibrio\n" +
				"•\tEspasmos musculares\n" +
				"•\tEntumecimiento o sensación anormal en cualquier zona\n" +
				"•\tProblemas para mover los brazos y las piernas\n" +
				"•\tProblemas para caminar\n" +
				"•\tProblemas con la coordinación y para hacer movimientos pequeños\n" +
				"•\tTemblor en uno o ambos brazos o piernas\n" +
				"•\tDebilidad en uno o ambos brazos o piernas\n" +
				"Síntomas vesicales e intestinales:\n" +
				"•\tEstreñimiento y escape de heces\n" +
				"•\tDificultad para comenzar a orinar\n" +
				"•\tNecesidad frecuente de orinar\n" +
				"•\tUrgencia intensa de orinar\n" +
				"•\tEscape de orina (incontinencia)\n" +
				"Síntomas oculares:\n" +
				"•\tVisión doble\n" +
				"•\tMolestia en los ojos\n" +
				"•\tMovimientos oculares incontrolables\n" +
				"•\tPérdida de visión (usualmente afecta un ojo a la vez)\n" +
				"Entumecimiento, hormigueo o dolor:\n" +
				"•\tDolor facial\n" +
				"•\tEspasmos musculares dolorosos\n" +
				"•\tSensación de picazón, hormigueo o ardor en brazos y piernas\n" +
				"Otros síntomas cerebrales y neurológicos:\n" +
				"•\tDisminución del período de atención, de la capacidad de discernir y pérdida de la memoria\n" +
				"•\tDificultad para razonar y resolver problemas\n" +
				"•\tDepresión o sentimientos de tristeza\n" +
				"•\tMareos o pérdida del equilibrio\n" +
				"•\tHipoacusia (pérdida de la audición)\n" +
				"Síntomas sexuales:\n" +
				"•\tProblemas de erección\n" +
				"•\tProblemas con la lubricación vaginal\n" +
				"Síntomas del habla y de la deglución:\n" +
				"•\tLenguaje mal articulado o difícil de entender\n" +
				"•\tProblemas para masticar y deglutir\n" + "\n"+
		"TRATAMIENTO\n" +
				"Medicamentos \n" +
				"•\tInmunosupresor \n" +
				"Reduce la respuesta inmune \n" +
				"•\tEsteroide \n" +
				"Modifica o simula loa efectos hormonales, a menudo para reducir la inflamación o para inducir el crecimiento y la reparación de tejidos \n" +
				"•\tAntiinflamatorio  \n" +
				"Previene o contrarresta la hinchazón (inflamación) en las articulaciones y los tejidos.\n" +
				"•\tQuimioterapia \n" +
				"Mata a las células que crecen o se multiplican demasiado rápido. \n" +
				"Cuidado personal \n" +
				"•\tEjercicio físico\n" +
				" Realizar actividad aeróbica durante 20 a 30 minutos, cinco días a la semana mejora la salud cardiovascular.\n" +
				"Especialistas \n" +
				"•\tNeurólogo\n" +
				"Trata los trastornos del sistema nervioso \n" +
				"•\tFonoaudiólogo\n" +
				"Es especialista en rehabilitación de la voz \n" +
				"•\tTerapeuta ocupacional \n" +
				"Mejora la vida diaria y las habilidades motrices de los pacientes. \n" +
				"•\tMédico de atención primaria \n" +
				"Previene, diagnostica y trata enfermedades.\n" +
				"\n" + "\n" + "Fuente: MedlinePlus"));

			// Faringitis

		aniadirEntrada(new Lista_entrada("5", R.drawable.faringitis, "FARINGITIS", "INFORMACION\n" +
				"La faringitis, o dolor de garganta, es la molestia, el dolor o la carraspera en la garganta que a menudo hace que se presente dolor al tragar.\n" +
				"\n" + "\n"+
		"CAUSAS\n" +
				"La faringitis es causada por hinchazón de la parte posterior de la garganta (faringe), entre las amígdalas y la laringe.\n" +
				"La mayoría de los dolores de garganta son causados por resfriados, gripe, virus coxsackie o mononucleosis.\n" + "\n"+
		"SINTOMAS\n" +
				"•\tDolor de garganta \n" +
				"•\tFiebre\n" +
				"•\tDolor de cabeza\n" +
				"•\tDolores musculares y articulares\n" +
				"•\tErupción cutánea\n" +
				"•\tGanglios linfáticos inflamados en el cuello\n" + "\n"+
		"TRATAMIENTO\n" +
				"Medicamento \n" +
				"•\tAntibiótico\n" +
				" Detiene el crecimiento de las bacterias o las elimina.\n" +
				"•\tAntivirales \n" +
				"Reduce la capacidad de los virus para reproducirse.\n" +
				"•\tAntiinflamatorio no esteroideo \n" +
				"Alivia el dolor, disminuye la inflamación y reduce la fiebre\n" +
				"•\tAnalgésico\n" +
				"Alivia el dolor \n" +
				"Especialistas\n" +
				"•\tMédico de atención primaria \n" +
				"Previene, diagnostica y trata enfermedades.\n" +
				"•\tPediatra \n" +
				"Brinda atención médica a bebes, niños y adolescentes. \n" +
				"\n" + "\n"+
		"Fuente: MedlinePlus"));



		aniadirEntrada(new Lista_entrada("6", R.drawable.gastritis3, "GASTRITIS", "INFORMACION\n" +
				"La gastritis ocurre cuando el revestimiento del estómago resulta hinchado o inflamado.\n" +
				"Puede durar sólo por un corto tiempo (gastritis aguda). También puede perdurar durante meses o años (gastritis crónica).\n" +
				"\n" + "\n" + "CAUSAS\n" +
				"Las causas más comunes de gastritis son:\n" +
				"•\tCiertos medicamentos como ácido acetilsalicílico.\n" +
				"•\tTomar demasiado alcohol.\n" +
				"•\tInfección del estómago con una bacteria llamada Helicobacter pylori.\n" +
				"Las causas menos comunes son:\n" +
				"•\tTrastornos autoinmunitarios.\n" +
				"•\tReflujo de bilis hacia el estómago (reflujo biliar).\n" +
				"•\tConsumo de cocaína.\n" +
				"•\tIngerir o beber sustancias corrosivas o cáusticas (como venenos).\n" +
				"•\tEstrés extremo.\n" +
				"•\tInfección viral, como citomegalovirus y el virus del herpes simple.\n" + " \n"+
		"SINTOMAS\n" +
				"•\tInapetencia\n" +
				"•\tNáuseas y vómitos\n" +
				"•\tDolor en la parte superior del vientre o el abdomen\n" +
				"Si la gastritis está causando sangrado del revestimiento del estómago, los síntomas pueden incluir:\n" +
				"\n" +
				"•\tHeces negras\n" +
				"•\tVómitos con sangre o material con aspecto de café molido\n" + " \n"+
		"TRATAMIENTO\n" +
				"Medicamentos \n" +
				"•\tAntiácido\n" +
				"Contrarresta los efectos del ácido estomacal \n" +
				"•\tInhibidor de la bomba de protones\n" +
				"Reduce la sensación de ácido en el estomago\n" +
				"•\tAntibiótico\n" +
				"Detiene el crecimiento de las bacterias o las elimina \n" +
				"•\tAntidiarreicos \n" +
				"Reduce la frecuencia y la urgencia de las deposiciones \n" +
				"Especialistas \n" +
				"•\tGastroenterólogo\n" +
				"Es especialista en el aparato digestivo \n" +
				"•\tMédico de atención primaria \n" +
				"Previene, diagnostica y trata enfermedades.\n" +
				"\n" +
				" \n"+ "\n"+ "Fuente: MedlinePlus"));

		//Gripe

		aniadirEntrada(new Lista_entrada("7", R.drawable.gripe, "Gripe", "INFORMACION\n" +
				"La gripe es una infección respiratoria causada por cierto número de virus. El virus se transmite por el aire e ingresa al organismo a través de la nariz o la boca.\n"
		+ "\n" + " CAUSAS\n" +
				"El virus de la gripe inicialmente se une a las células de la mucosa de las vías respiratorias superiores (células secretoras de mucosidad, células ciliadas y células epiteliales) y las destruye, eliminando así el primer sistema de defensa del sistema respiratorio, y posteriormente puede alcanzar las vías respiratorias inferiores causando una descamación grave del epitelio bronquial o alveolar.\n"
		+ "\n"+ "SINTOMAS\n" +
				"Los síntomas de la gripe aparecen súbitamente y son peores que los del resfrío. Pueden incluir:\n" +
				"•\tDolores en el cuerpo y los músculos\n" +
				"•\tEscalofríos\n" +
				"•\tTos\n" +
				"•\tFiebre\n" +
				"•\tDolor de cabeza\n" +
				"•\tDolor de garganta\n" + "\n" +
		"TRATAMIENTO\n" +
				"Medicamentos\n" +
				"•\tDescongestivo \n" +
				"Alivia la congestión nasal, la inflamación y secreción nasal\n" +
				"•\tAntiinflamatorio no esteroideo \n" +
				"Alivia el dolor, disminuye la inflamación y reduce la fiebre\n" +
				"•\tAnalgésico\n" +
				"Alivia el dolor\n" +
				"•\tAntivirales \n" +
				"Reduce la capacidad de los virus para reproducirse.\n" +
				"•\tAntitusígeno\n" +
				"Impide el reflejo de la tos. Algunos pueden disminuir o aflojar la mucosidad. \n" +
				"Especialistas\n" +
				"•\tMédico de atención primaria \n" +
				"Previene, diagnostica y trata enfermedades.\n" +
				"•\tPediatra \n" +
				"Brinda atención médica a bebes, niños y adolescentes. \n" +
				"\n" + "\n" + "Fuente: MedlinePlus"));

		//HIPERTENSION ARTERIAL
		aniadirEntrada(new Lista_entrada("8", R.drawable.hipertension, "HIPERTENSION ARTERIAL", "INFORMACION\n" +
				"La presión arterial es una medición de la fuerza ejercida contra las paredes de las arterias a medida que el corazón bombea sangre a su cuerpo. Hipertensión es el término que se utiliza para describir la presión arterial alta.\n" + "\n"+
		"CAUSAS\n" +
				"Muchos factores pueden afectar la presión arterial, incluso:\n" +
				"•\tLa cantidad de agua y de sal que usted tiene en el cuerpo\n" +
				"•\tEl estado de los riñones, el sistema nervioso o los vasos sanguíneos\n" +
				"•\tSus niveles hormonales\n" +
				"•\tAlto consumo en sodio \n"+ "\n" +
		"SINTOMAS\n" +
				"La hipertensión maligna es una forma peligrosa de presión arterial muy alta. Los síntomas incluyen:\n" +
				"•\tDolor de cabeza fuerte\n" +
				"•\tNáuseas o vómitos\n" +
				"•\tConfusión\n" +
				"•\tCambios en la visión\n" +
				"•\tSangrado nasal\n" + "\n"+
		"TRATAMIENTOS\n" +
				"Medicamentos\n" +
				"•\tInhibidor de ECA \n" +
				"Relaja los vasos sanguíneos, reduce la presión arterial y previene el daño renal relacionado con la diabetes\n" +
				"•\tDiurético\n" +
				"Aumenta la producción de orina para eliminar el exceso de sal y agua.\n" +
				"•\tBeta bloqueador \n" +
				"Ralentiza el ritmo cardiaco y reduce la presión arterial\n" +
				"•\tAntihipertensivo \n" +
				"Reduce la presión arterial \n" +
				"•\tBloqueador de los canales de calcio \n" +
				"Relaja los vasos sanguíneos \n" +
				"•\tVasodilatador \n" +
				"Ensancha los vasos sanguíneos \n" +
				"Cuidado personal\n" +
				"•\tEjercicio físico\n" +
				"Realizar actividad aeróbica durante 20 a 30 minutos, cinco días a la semana mejora la salud cardiovascular.\n" +
				"•\tControl de estrés \n" +
				"Realizar una actividad agradable o verbalizar la frustración para reducir el estrés y mejorar la salud mental\n" +
				"Alimentación \n" +
				"•\tDieta baja en sodio \n" +
				"Restricción de sal. \n" +
				"Especialistas \n" +
				"•\tCardiólogo\n" +
				"Especialista en trastornos cardiacos \n" +
				"•\tMédico de atención primaria \n" +
				"Previene, diagnostica y trata enfermedades.\n" +
				"•\tNutriólogo\n" +
				"Especialista en la alimentación y nutrición.  \n"+ "\n" + "Fuente: MedlinePlus"));

		// INSOMNIO
		aniadirEntrada(new Lista_entrada("9", R.drawable.insomnio, "INSOMNIO", "INFORMACION\n" +
				"Consiste en una reducción de la capacidad para dormir, pudiendo manifestarse de diversos modos que dan lugar a diferentes tipos de insomnio\n"+ "\n" +
		"CAUSAS\n" +
				"Enfermedades metabólicas y hormonales, neurológicas, reumatológicas, digestivas, cardiovasculares y todas aquellas que pueden interrumpir el sueño por dolor –fibromialgia, cefaleas, etc- o urológicas por la necesidad urgente de micción –infecciones, próstata, renales. También hay que considerar el embarazo y la menopausia.\n" +
				"puntito\n" +
				"Enfermedades psiquiátricas (ansiedad, depresión, esquizofrenia, etc), así como otras enfermedades del sueño que contribuyen a dormir menos o peor (síndrome de piernas inquietas, síndrome de apnea de sueño, parasomnias, etc.\n" + "\n"+
		"SINTOMAS\n" +
				"Cognitivos: lentitud para realizar actividades o falta de concentración\n" +
				"También comunes: dificultad para dormir, somnolencia durante el día, depresión, dolor de cabeza o irritabilidad\n"+
		"\n"+ "TRATAMIENTO\n" +
				"Medicamento\n" +
				"•\tSedante\n" +
				"Causa somnolencia, tranquilidad y adormecimiento de los sentidos. Algunos tipos pueden llegar a ser adictivos.\n" +
				"•\tAntihistamínico\n" +
				"Reduce o detiene una reacción alérgica.\n" +
				"•\tAntidepresivo\n" +
				"Previene o alivia la depresión y mejora el estado de ánimo.\n" +
				"\n" +
				"\n" +
				"Cuidado personal \n" +
				"•\tHigiene del sueño\n" +
				"Los buenos hábitos para dormir incluyen un cronograma de sueño regular y evitar las siestas, la cafeína y mirar TV antes de acostarse.\n" +
				"•\tFototerapia\n" +
				"Exposición a la luz brillante mediante un dispositivo llamado caja de luz. Imita la luz solar natural.\n" +
				"Terapia \n" +
				"•\tTerapia cognitivo-conductual\n" +
				"Terapia verbal que se enfoca en la modificación de las respuestas emocionales, los pensamientos y los comportamientos negativos asociados con los trastornos psicológicos.\n" +
				"Especialistas \n" +
				"•\tMédico de atención primaria\n" +
				"Previene, diagnostica y trata las enfermedades.\n" +
				"•\tPsicólogo clínico\n" +
				"Trata los trastornos mentales principalmente con terapia conversacional.\n" +
				"•\tEspecialista en medicina del sueño\n" +
				"Trata los trastornos y los problemas para dormir.\n" +
				"•\tPsiquiatra\n" +
				"Trata los trastornos mentales principalmente con medicamentos.\n" + "\n"+
		"Fuente: MedlinePlus"));

		// ORZUELO

		aniadirEntrada(new Lista_entrada("10", R.drawable.orzuelo, "ORZUELO", "INFORMACION\n" +
				"Un orzuelo es una glándula sebácea inflamada en el borde del párpado, donde este se encuentra con la pestaña, y aparece como una protuberancia inflamada y rojiza que luce como un grano. Con frecuencia es sensible al tacto.\n" + "\n" +
		"CAUSAS\n" +
				"Un orzuelo es causado por un bloqueo en una de las glándulas sebáceas en los párpados. Esto permite que las bacterias se multipliquen dentro de la glándula bloqueada. Los orzuelos se parecen mucho a los granos comunes del acné que se dan en cualquier parte de la piel. Usted puede tener más de un orzuelo al mismo tiempo.\n" + "\n" +
		"SINTOMAS\n" +
				"Además de la protuberancia enrojecida e inflamada, otros posibles síntomas son:\n" +
				"•\tSensación irritante y arenosa, como si hubiese un cuerpo extraño en el ojo\n" +
				"•\tSensibilidad a la luz\n" +
				"•\tLagrimeo del ojo\n" +
				"•\tSensibilidad del párpado\n" + "\n" +
		"TRATAMIENTO\n" +
				"Cuidado personal\n" +
				"•\tCompresa caliente\n" +
				"Alivia dolores musculares o de las articulaciones, y puede ayudar a drenar infecciones de la piel.\n" +
				"Especialistas\n" +
				"•\tOptometrista\n" +
				"Diagnostica y trata los cambios en la vista.\n" +
				"•\tPediatra\n" +
				"Brinda atención médica a los bebés, niños y adolescentes.\n" +
				"•\tMédico de atención primaria\n" +
				"Previene, diagnostica y trata las enfermedades.\n" +
				"•\tOftalmólogo\n" +
				"Es especialista en las enfermedades de los ojos.\n" + "\n" +
		"Fuente: MedlinePlus"));

		//Paperas

		aniadirEntrada(new Lista_entrada("11", R.drawable.paperas, "PAPERAS", "INFORMACION\n" +
				"Es una enfermedad contagiosa que causa una inflamación dolorosa de las glándulas salivales, las cuales producen la saliva, un líquido que humedece los alimentos y le ayuda a uno a masticar y tragar.\n" + "\n" +
				"CAUSAS\n" +
				"son causadas por un virus. Este se transmite de una persona a otra por medio de las gotitas de la humedad de la nariz o la boca, como por ejemplo, cuando una persona estornuda. También se propaga a través del contacto directo con artículos que contienen saliva infectada.\n" + "\n" +
		"SINTOMAS\n" +
				"Los síntomas de paperas pueden incluir:\n" +
				"•\tDolor facial\n" +
				"•\tFiebre\n" +
				"•\tDolor de cabeza\n" +
				"•\tDolor de garganta\n" +
				"•\tPérdida de apetito\n" +
				"•\tInflamación de las glándulas parótidas (las glándulas salivales más grandes, localizadas entre el oído y la mandíbula )\n" +
				"•\tInflamación de las sienes o mandíbula (área temporomandibular)\n" +
				"Otros síntomas de esta enfermedad que pueden ocurrir en los hombres:\n" +
				"•\tTumor testicular\n" +
				"•\tDolor testicular\n" +
				"•\tInflamación del escroto\n"+ "\n" +
		"TRATAMIENTO\n" +
				"MEDICAMENTOS \n" +
				"•\tAntiinflamatorio no esteroideo\n" +
				"Alivia el dolor, disminuye la inflamación y reduce la fiebre.\n" +
				"•\tAnalgésico\n" +
				"Alivia el dolor.\n" +
				"Cuidado personal\n" +
				"•\tReposo en cama\n" +
				"Reducir la actividad durante un período corto después de una lesión o una enfermedad para favorecer la curación\n" +
				"Preventivo\n" +
				"•\tVacuna triple viral\n" +
				"•\tVacuna combinada que protege contra el sarampión, las paperas y la rubéola.\n" +
				"Especialistas\n" +
				"•\tInfectólogo\n" +
				"Trata las infecciones, incluidas las de origen tropical.\n" +
				"•\tPediatra\n" +
				"Brinda atención médica a los bebés, niños y adolescentes.\n" +
				"•\tMédico de atención primaria\n" +
				"Previene, diagnostica y trata las enfermedades.\n"+ "\n"+
		"Fuente: MedlinePlus"));

		//QUISTES OVARICOS

		aniadirEntrada(new Lista_entrada("12", R.drawable.quistes_ovaricos, "QUISTES OVARICOS", "INFORMACION\n" +
				"Un quiste es un saco lleno de líquido que se forma sobre o dentro de un ovario.\n"+ "\n"+
		"CAUSAS\n" +
				"Cada mes, durante el ciclo menstrual, crece un folículo (donde el óvulo se está desarrollando) en el ovario. La mayoría de los meses, se libera un óvulo de este folículo, lo cual se denomina ovulación. Si el folículo no logra abrirse y liberar un óvulo, el líquido permanece dentro del folículo y forma un quiste, el cual se denomina quiste folicular.\n" + "\n" +
		"SINTOMAS\n" +
				"Los quistes ováricos con frecuencia no causan síntomas.\n" +
				"Un quiste ovárico tiene más probabilidad de causar dolor si:\n" +
				"•\tSe vuelve grande\n" +
				"•\tSangra\n" +
				"•\tSe rompe\n" +
				"•\tInterfiere con el riego sanguíneo al ovario\n" +
				"•\tSe golpea durante la relación sexual\n" +
				"•\tSe tuerce o causa torsión de las trompas de Falopio\n" +
				"Los síntomas de los quistes ováricos pueden abarcar:\n" +
				"•\tDistensión o hinchazón abdominal\n" +
				"•\tDolor durante la defecación\n" +
				"•\tDolor pélvico poco después del comienzo o finalización del período menstrual\n" +
				"•\tDolor con las relaciones sexuales o dolor pélvico durante el movimiento\n" +
				"•\tDolor pélvico constante y sordo\n" +
				"•\tDolor pélvico intenso y repentino, a menudo con náuseas y vómitos, que puede ser un signo de torsión o retorcimiento del ovario en su riego sanguíneo o ruptura de un quiste con sangrado interno\n"+ "\n"+
		"TRATAMIENTO\n" +
				"Medicamentos\n" +
				"•\tHormona\n" +
				"Influye en los procesos del cuerpo mediante la regulación de la actividad de los órganos.\n" +
				"Cuidado de apoyo\n" +
				"•\tTerapia expectante\n" +
				"Controlar una afección médica, en vez de tomar medidas de inmediato\n" +
				"Cirugía\n" +
				"•\tCirugía laparoscópica\n" +
				"Cirugía que usa una cámara de video y tubos delgados que se introducen mediante pequeños cortes en el cuerpo para reparar o eliminar tejido.\n" +
				"Especialistas\n" +
				"•\tMédico ginecólogo y obstetra\n" +
				"Es especialista en la salud reproductiva de las mujeres y el parto.\n" +
				"•\tMédico de atención primaria\n" +
				"Previene, diagnostica y trata las enfermedades.\n"+ "\n"+
		"Fuente: MedlinePlus"));

		//RESFRIADO

		aniadirEntrada(new Lista_entrada("13", R.drawable.resfriado, "RESFRIADO", " INFORMACION"+ "\n"+
				"Infección viral común de la nariz y la garganta" + "\n"+
		"\n" + "CAUSAS\n" +
				"Un virus del resfriado se propaga a través de diminutas gotitas aéreas que se liberan cuando una persona enferma estornuda, tose o se suena la nariz.\n" +
				"Usted puede contraer un resfriado si:\n" +
				"Una persona con un resfriado estornuda, tose o se suena la nariz cerca de usted.\n" +
				"Usted se toca la nariz, los ojos o la boca después de haber tocado algo contaminado por el virus, como un juguete o el pestillo de una puerta.\n" +
				"Las personas son más contagiosas durante los primeros 2 a 3 días del resfriado. Un resfriado en la mayoría de los casos no es contagioso después de la primera semana.\n"+ "\n"+
		"SINTOMAS\n" +
				"Los síntomas del resfriado por lo regular comienzan aproximadamente de 2 a 3 días después de que usted entró en contacto con el virus, aunque podrían demorar hasta una semana. Los síntomas afectan principalmente la nariz.\n" +
				"Los síntomas más frecuentes del resfriado son:\n" +
				"•\tCongestión nasal\n" +
				"•\tRinorrea\n" +
				"•\tCarraspera\n" +
				"•\tTos\n" +
				"•\tDisminución del apetito\n" +
				"•\tDolor de cabeza\n" +
				"•\tDolores muscularesEstornudo\n"+ "\n" +
		"TRATAMIENTO\n" +
				"Medicamentos\n" +
				"•\tAntiinflamatorio no esteroideo\n" +
				"Alivia el dolor, disminuye la inflamación y reduce la fiebre.\n" +
				"•\tAnalgésico\n" +
				"Alivia el dolor.\n" +
				"Antihistamínico\n" +
				"Reduce o detiene una reacción alérgica.\n" +
				"•\tAntitusígeno\n" +
				"Impide el reflejo de la tos. Algunos pueden disminuir y aflojar la mucosidad, por lo tanto, logra que se despejen más fácilmente las vías respiratorias.\n" +
				"•\tDescongestivo\n" +
				"Alivia la congestión nasal, la inflamación y la secreción nasal.\n" +
				"Cuidado personal\n" +
				"•\tMentol\n" +
				"Aceite hecho a base de menta que alivia los dolores de garganta y la picazón.\n" +
				"•\tLavado nasal\n" +
				"Enjuagar el interior de la nariz con agua tibia salada para eliminar irritantes y el exceso de mucosidad. Suele hacerse con una jarra de neti o una botella de presión.\n" +
				"Pastillas para la garganta\n" +
				"Alivian el dolor de garganta.\n" +
				"Especialistas\n" +
				"•\tPediatra\n" +
				"Brinda atención médica a los bebés, niños y adolescentes.\n" +
				"•\tMédico de atención primaria\n" +
				"Previene, diagnostica y trata las enfermedades.\n"+ "\n" +
		"Fuente: MedlinePlus"));

		//SIDA
		aniadirEntrada(new Lista_entrada("14", R.drawable.sida, "SIDA", "INFORMACION\n" +
				"El VIH ocasiona el SIDA y, además, interfiere con la capacidad del cuerpo de combatir infecciones.\n" + "\n" +
		"SINTOMAS\n" +
				"Los síntomas relacionados con la infección aguda por VIH (cuando una persona se infecta por primera vez) pueden ser similares a la gripe u otras enfermedades virales. Estas incluyen:\n" +
				"•\tFiebre y dolor muscular\n" +
				"•\tDolor de cabeza\n" +
				"•\tDolor de garganta\n" +
				"•\tSudoración nocturna\n" +
				"•\tÚlceras bucales, incluso infección por hongos (candidiasis)\n" +
				"•\tGanglios linfáticos inflamados\n" +
				"•\tDiarrea\n"+ "\n"+
		"TRATAMIENTO\n" +
				"Medicamentos\n" +
				"•\tAntiviral para el VIH\n" +
				"Inhibe el VIH para frenar la progresión de la infección. Reduce el riesgo de infectar a otros.\n" +
				"Especialistas\n" +
				"•\tInfectólogo\n" +
				"Trata las infecciones, incluidas las de origen tropical.\n" +
				"Psicólogo clínico\n" +
				"Trata los trastornos mentales principalmente con terapia conversacional.\n" +
				"•\tMédico de atención primaria\n" +
				"Previene, diagnostica y trata las enfermedades\n"+ "\n"+
		"Fuente: MedlinePlus"));

		// TRACOMA
		aniadirEntrada(new Lista_entrada("15", R.drawable.tacoma, "TRACOMA", "INFORMACION\n" +
				"Es una infección ocular causada por una bacteria llamada chlamydia.\n" + "\n"+
		"CAUSAS\n" +
				"El tracoma se propaga a través del contacto directo con el ojo o nariz infectados o las secreciones de la garganta. También se puede propagar por el contacto con objetos contaminados, como toallas o prendas de vestir. Además, ciertas moscas pueden transmitir la bacteria.\n" + "\n" +
		"SINTOMAS\n" +
				"Los síntomas comienzan de 5 a 12 días después de haber estado expuesto a la bacteria. La afección comienza lentamente. Primero aparece como una inflamación del tejido que recubre los párpados (conjuntivitis u \"ojo rojo\"). Sin tratamiento, esto puede conducir a cicatrización.\n" +
				"Los síntomas pueden abarcar:\n" +
				"•\tOpacidad de la córnea\n" +
				"•\tSecreción ocular\n" +
				"•\tInflamación de los ganglios linfáticos justo delante de las orejas\n" +
				"•\tPárpados inflamados\n" +
				"•\tPestañas invertidas\n" + "\n" +
		"TRATAMIENTO \n" +
				"Medicamentos\n" +
				"Antibiótico\n" +
				"Detiene el crecimiento de las bacterias o las elimina.\n" +
				"Preventivo\n" +
				"Higiene\n" +
				"Limpieza personal que promueve la salud y el bienestar. Por ejemplo, lavarse las manos antes de comer.\n" +
				"Cirugía\n" +
				"Rotación tarsal\n" +
				"Cirugía que aleja las pestañas del ojo.\n" +
				"Queratoplastia\n" +
				"Reemplazo quirúrgico de la capa externa transparente del ojo (córnea) por una córnea donada.\n" +
				"Especialistas\n" +
				"Oftalmólogo\n" +
				"Es especialista en las enfermedades de los ojos.\n" +
				"Infectólogo\n" +
				"Trata las infecciones, incluidas las de origen tropical.\n" +
				"Médico de atención primaria\n" +
				"Previene, diagnostica y trata las enfermedades.\n" + "\n" +
		"Fuente: MedlinePlus"));

		// 	URTICARIA

		aniadirEntrada(new Lista_entrada("0", R.drawable.urticaria, "URTICARIA", "INFORMACION\n" +
				"Son ronchas rojizas, elevadas y a menudo pruriginosas que aparecen en la superficie de la piel. Usualmente son una reacción alérgica a algún alimento o medicamento.\n" +
		"\n"+ "CAUSAS\n" +
				"Cuando usted tiene una reacción alérgica a una sustancia, el cuerpo libera histamina y otros químicos dentro del torrente sanguíneo. Esto causa prurito, inflamación y otros síntomas. La urticaria es una reacción común. Las personas con otras reacciones alérgicas, como la fiebre de heno, a menudo presentan urticaria.\n" + "\n" +
		"SINTOMAS\n" +
				"Los síntomas de urticaria pueden incluir cualquiera de los siguientes:\n" +
				"•\tPrurito\n" +
				"Inflamación de la superficie de la piel con ronchas (también llamadas habones) de color similar al de la piel o rojizo con bordes claramente definidos\n" +
				"•\tLas ronchas se pueden agrandar, diseminar y unir formando zonas más grandes de piel plana y elevada.\n" +
				"•\tTambién pueden cambiar de forma, desaparecer y reaparecer al cabo de minutos u horas. Puede saber que tiene urticaria cuando se presiona el centro de una roncha y esta se torna blanca. Esto se denomina palidez.\n" + "\n"+
		"TRATAMIENTO\n" +
				"Medicamentos\n" +
				"•\tAntihistamínico\n" +
				"Reduce o detiene una reacción alérgica.\n" +
				"•\tEsteroide\n" +
				"Modifica o simula los efectos hormonales, a menudo para reducir la inflamación o para inducir el crecimiento y la reparación de tejidos.\n" +
				"•\tVasoconstricción\n" +
				"Estrecha los vasos sanguíneos.\n" +
				"•\tAntiinflamatorio\n" +
				"Previene o contrarresta la hinchazón (inflamación) en las articulaciones y los tejidos.\n" +
				"\n" +
				"Cuidado personal\n" +
				"•\tTerapia de compresión en frío\n" +
				"Reduce la inflamación y disminuye la sensación de dolor.\n" +
				"Especialistas\n" +
				"•\tMédico de atención primaria\n" +
				"Previene, diagnostica y trata las enfermedades.\n" +
				"•\tEspecialista en medicina de urgencias\n" +
				"Trata a los pacientes en el servicio de urgencias.\n" + "\n"+
		"Fuente: MedlinePlus"));










	}

	
	/** A�ade una entrada a la lista
	 * @param entrada Elemento que a�adimos a la lista
	 */
	private static void aniadirEntrada(Lista_entrada entrada) {
		ENTRADAS_LISTA.add(entrada);
		ENTRADAS_LISTA_HASHMAP.put(entrada.id, entrada);
	}

	/**
	 * Representa una entrada del contenido de la lista
	 */
	public static class Lista_entrada {
		public String id;
		public int idImagen; 
		public String textoEncima; 
		public String textoDebajo; 
		  
		public Lista_entrada (String id, int idImagen, String textoEncima, String textoDebajo) { 
			this.id = id;
		    this.idImagen = idImagen; 
		    this.textoEncima = textoEncima; 
		    this.textoDebajo = textoDebajo; 
		}
	}
	
}
