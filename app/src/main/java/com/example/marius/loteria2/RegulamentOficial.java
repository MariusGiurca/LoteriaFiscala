package com.example.marius.loteria2;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class RegulamentOficial extends Activity {

    private TextView regulament;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regulament_oficial);
        regulament = (TextView) findViewById(R.id.textRegulament);
        regulament.setMovementMethod(new ScrollingMovementMethod());
        regulament.setText(
                "OG nr. 10/2015 pentru organizarea Loteriei bonurilor fiscale\n" +
                "În temeiul art. 108 din Constituţia României, republicată, al art. 1 pct. I.1 din Legea nr. 184/2014 privind abilitarea Guvernului de a emite ordonanţe,\n" +
                "Guvernul României adoptă prezenta ordonanţă.\n" +
                "Articolul 1\n" +
                "(1) Se aprobă organizarea Loteriei bonurilor fiscale, ca măsură pentru combaterea evaziunii fiscale şi încurajarea cumpărătorilor de a solicita bonurile fiscale în\n" +
                "vederea fiscalizării veniturilor operatorilor economici.\n" +
                "(2) Loteria bonurilor fiscale constă în extragerea aleatorie de numere, în vederea acordării de premii în bani, persoanelor fizice rezidente şi nerezidente în\n" +
                "România, definite potrivit Legii nr. 571/2003 privind Codul fiscal, cu modificările şi completările ulterioare, deţinătoare de bonuri fiscale care atestă cumpărarea\n" +
                "de bunuri sau servicii pe teritoriul României.\n" +
                "(3) Sumele de bani acordate potrivit prevederilor prezentei ordonanţe reprezintă premii în înţelesul art. 75 din Legea nr. 571/2003, cu modificările şi\n" +
                "completările ulterioare.\n" +
                "Articolul 2\n" +
                "(1) Loteria bonurilor fiscale se organizează lunar şi constă în extragerea aleatorie de numere, astfel:\n" +
                "a)un număr cuprins în intervalul dintre 1 şi 999 inclusiv, reprezentând valoarea totală a bonului fiscal fără subdiviziunile leului, inclusiv taxa pe valoarea\n" +
                "adăugată. Numărul reprezentând valoarea totală a bonului fiscal rezultă în urma extragerii succesive a trei serii de cifre, cuprinse între 0 şi 9;\n" +
                "şi\n" +
                "b)un număr reprezentând ziua emiterii bonului fiscal aferentă lunii sau intervalului calendaristic, după caz, pentru care se organizează Loteria bonurilor fiscale.\n" +
                "(2) Loteria bonurilor fiscale poate fi organizată şi ocazional, cu respectarea prevederilor alin. (1), după cum urmează:\n" +
                "a)cu ocazia sărbătorilor legale;\n" +
                "b )în situaţiile în care la extragerile lunare nu există câştigători două luni consecutive;\n" +
                "c )în alte situaţii stabilite prin ordin al ministrului finanţelor publice.\n" +
                "Articolul 3\n" +
                "(1) La extragerile lunare participă bonurile fiscale emise în luna calendaristică anterioară organizării extragerii.\n" +
                "(2) Extragerea se realizează în prima duminică după data de 15 a fiecărei luni, pentru luna anterioară.\n" +
                "Articolul 4\n" +
                "(1) La extragerile ocazionale participă bonurile fiscale emise în intervalul calendaristic anterior organizării extragerii, stabilit prin ordin al ministrului finanţelor\n" +
                "publice.\n" +
                "(2) Extragerea se realizează după minimum 15 zile de la sfârşitul intervalului calendaristic pentru care se organizează Loteria bonurilor fiscale.\n" +
                "Articolul 5\n" +
                "(1) Extragerile prevăzute la art. 3 şi 4 sunt organizate de către Compania Naţională „Loteria Română“ - S.A. şi sunt publice.\n" +
                "(2) Extragerile sunt efectuate în prezenţa Comisiei pentru supravegherea efectuării extragerilor, din care fac parte câte un reprezentant al Ministerului Finanţelor\n" +
                "Publice, al Agenţiei Naţionale de Administrare Fiscală, respectiv al Companiei Naţionale „Loteria Română“ - S.A.\n" +
                "(3) Rezultatul extragerilor prevăzute la art. 3 şi 4 se consemnează într-un proces-verbal care se transmite Ministerului Finanţelor Publice şi Agenţiei Naţionale de\n" +
                "Administrare Fiscală, aparat central, în prima zi lucrătoare după data extragerii.\n" +
                "(4) Procesul-verbal prevăzut la alin. (3) se postează, în termen de 24 de ore de la momentul comunicării, pe site-ul Ministerului Finanţelor Publice şi al Agenţiei\n" +
                "Naţionale de Administrare Fiscală pentru o perioadă de minimum 30 de zile.\n" +
                "(5) Costurile aferente organizării şi desfăşurării extragerilor sunt suportate de către Compania Naţională „Loteria Română“ - S.A.\n" +
                "Articolul 6\n" +
                "(1) Un bon fiscal este considerat câştigător dacă îndeplineşte cumulativ următoarele condiţii:\n" +
                "a)a fost emis de un aparat de marcat electronic fiscal care funcţionează în conformitate cu Ordonanţa de urgenţă a Guvernului nr. 28/1999 privind obligaţia\n" +
                "operatorilor economici de a utiliza aparate de marcat electronice fiscale, republicată, cu modificările şi completările ulterioare;\n" +
                "b)sunt lizibile toate informaţiile obligatorii, aşa cum sunt prevăzute de Ordonanţa de urgenţă a Guvernului nr. 28/1999, republicată, cu modificările şi\n" +
                "completările ulterioare;\n" +
                "c)are valoarea totală exprimată în monedă naţională, egală cu valoarea extrasă conform art. 2 alin. (1) lit. a);\n" +
                "d)a fost emis în ziua extrasă conform art. 2 alin. (1) lit. b);\n" +
                "e)nu are menţionat niciun cod de înregistrare fiscală al cumpărătorului.\n" +
                "(2) Revendicarea premiilor se face prin depunerea bonului fiscal câştigător, în original, la orice unitate teritorială a Agenţiei Naţionale de Administrare Fiscală,\n" +
                "alături de copia actului de identitate sau a paşaportului titularului bonului şi de o cerere al cărei model şi conţinut se aprobă prin ordin al ministrului finanţelor\n" +
                "publice, până la data de 30 martie 2015, la propunerea Agenţiei Naţionale de Administrare Fiscală.\n" +
                "(3) Revendicarea premiilor se face în termen de maximum 30 de zile de la data extragerii, acest termen reprezentând termen de decădere din dreptul de a\n" +
                "revendica premiul.\n" +
                "(4) În termen de 10 zile de la expirarea perioadei prevăzute la alin. (3), unităţile teritoriale transmit către Agenţia Naţională de Administrare Fiscală, aparat\n" +
                "central, lista persoanelor care au revendicat premiile potrivit alin. (2).\n" +
                "(5) Plata câştigurilor se face de către Ministerul Finanţelor Publice, în termen de 60 de zile de la expirarea termenului de revendicare a premiilor.\n" +
                "(6) Verificarea autenticităţii şi realităţii bonurilor fiscale depuse pentru revendicarea premiilor se realizează de către organul competent al Agenţiei Naţionale de\n" +
                "Administrare Fiscală, conform unei proceduri stabilite prin ordin al ministrului finanţelor publice, la propunerea Agenţiei Naţionale de Administrare Fiscală.\n" +
                "(7) În cazul constatării elementelor constitutive ale unei infracţiuni, sunt sesizate organele de cercetare competente, iar plata premiului revendicat se suspendă\n" +
                "până la soluţionarea cauzei penale.\n" +
                "(8) La solicitarea titularului bonului fiscal, unitatea teritorială a Agenţiei Naţionale de Administrare Fiscală unde a fost depus originalul bonului fiscal câştigător\n" +
                "eliberează o copie care poartă menţiunea „conform cu originalul“.\n" +
                "Articolul 7\n" +
                "(1) Ministerul Finanţelor Publice stabileşte fondul anual de premiere pentru Loteria bonurilor fiscale, precum şi repartizarea lunară a acestuia.\n" +
                "(2) Fondul de premiere este evidenţiat în bugetul Ministerului Finanţelor Publice - Acţiuni generale, la o poziţie distinctă.\n" +
                "(3) În vederea determinării valorii câştigătoare pentru un bon fiscal, după centralizarea situaţiei bonurilor fiscale câştigătoare revendicate în termen, se împarte\n" +
                "fondul lunar de premiere la numărul total al bonurilor fiscale câştigătoare revendicate în termen, iar suma astfel obţinută se rotunjeşte la leu în favoarea\n" +
                "câştigătorului.Consultant Fiscal Adrian Benta www.bentaconsult.ro ; adrian@bentaconsult.ro tel: 0723 530 139\n" +
                "Act normativ descarcat prin abonament Alerta Fiscala / Revista Prietenii Contabilitatii\n" +
                "(4) În cazul în care într-o lună calendaristică nu există câştigători, fondul de premiere se reportează pentru extragerea următoare.\n" +
                "Articolul 8\n" +
                "(1)\n" +
                "Pentru anul 2015, prima extragere lunară are loc în luna iulie 2015.\n" +
                "(2)\n" +
                "În anul 2015, suma necesară pentru asigurarea fondului de premiere pentru Loteria bonurilor fiscale se asigură prin virări de credite bugetare, cu\n" +
                "încadrarea\n" +
                "în bugetul aprobat Ministerului Finanţelor Publice - Acţiuni generale, conform legislaţiei în vigoare.\n" +
                "Articolul 9\n" +
                "Pentru punerea în aplicare a prezentei ordonanţe, Ministerul Finanţelor Publice emite instrucţiuni aprobate prin ordin al ministrului finanţelor publice, până la data\n" +
                "de 30 martie 2015.\n" +
                "Articolul 10\n" +
                "Ordonanţa de urgenţă a Guvernului nr. 28/1999 privind obligaţia operatorilor economici de a utiliza aparate de marcat electronice fiscale, republicată în Monitorul\n" +
                "Oficial al României, Partea I, nr. 75 din 21 ianuarie 2005, cu modificările şi completările ulterioare, se modifică şi se completează după cum urmează:\n" +
                "1. La articolul 1, după alineatul (10) se introduce un nou alineat, alineatul (10 1 ), cu următorul cuprins:\n" +
                "(10 1 ) În cazul în care operatorii economici prevăzuţi la alin. (1) refuză emiterea şi înmânarea bonului fiscal clientului, cu excepţia situaţiei prevăzute la alin.\n" +
                "(8), acesta din urmă are dreptul de a beneficia de bunul achiziţionat sau de serviciul prestat fără plata contravalorii acestuia.\n" +
                "La articolul 1, alineatul (11) se modifică şi va avea următorul cuprins:\n" +
                "(11) Operatorii economici prevăzuţi la alin. (1) sunt obligaţi să afişeze la loc vizibil un anunţ detaliat de atenţionare a clienţilor cu privire la obligaţia respectării dispoziţiilor prevăzute la\n" +
                "alin. (9), (10) şi (10 1 ). Modelul şi conţinutul anunţului se aprobă prin ordin al ministrului finanţelor publice.\n" +
                "Articolul 11\n" +
                "Prevederile art. 10 se aplică începând cu data de 1 martie 2015.\n" +
                "PRIM-MINISTRU\n" +
                "VICTOR-VIOREL PONTA\n" +
                "Contrasemnează:\n" +
                "Ministrul finanţelor publice,\n" +
                "Darius-Bogdan Vâlcov\n" +
                "Bucureşti, 28 ianuarie 2015.\n" +
                "Nr. 10.");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_regulament_oficial, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
