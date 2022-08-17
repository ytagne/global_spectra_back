/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iwomi.base.ServiceInterface;

import java.util.List;

import iwomi.base.form.LiveReportFormS;
import iwomi.base.form.ReportResultFomS;
import iwomi.base.objects.LiveTraitementS;
import iwomi.base.objects.LiveTraitementv1S;

/**
 *
 * @author fabri
 */
public interface LiveReportingServiceS {

    void detailsReportingToTheVue2(String idTrait, String codeFichier, Long minimum);

    ReportResultFomS returnLivereport(LiveReportFormS liveReport);

    ReportResultFomS returnLivereport1(LiveReportFormS liveReport);

    Long beginGobalReportingToTheVue(String codeUnique, String cetab, String usid, String Operation, Long NbreTotal);

    void endGobalReportingToTheVue(Long id, Long statut, Long nbTraite);

    void endDetailsReportingToTheVue(String idTraitement, String codefichier, Long statut, Long nbreTraite);

    void detailsReportingToTheVue3(String idTrait, String codeFichier, Long minimum);
            
    void endDetailsReportingToTheVue1(String idTraitement, String codefichier, Long statut, Long nbreTraite, Long r);

    String beginDetailsReportingToTheVue(Long idope, String codeFichier, Long nbreTotal);

    Long detailsReportingToTheVue(String idTrait, String codefichier, Long nbreTotal, Long Nbretraite, Long quotien,
            Long minimum);

    void detailsReportingToTheVue1(String idTrait, String codeFichier, Long minimum);

    void endGobalReportingToTheVue1(Long id, Long statut);

    String beginDetailsReportingToTheVue1(Long idope, String codeFichier, Long nbreTotal);

    List<ReportResultFomS> returnLivereport2(LiveReportFormS liveReport);

    LiveTraitementv1S beginDetailsReportingToTheVue2(Long idope, String codeFichier, Long nbreTotal);

    void endDetailsReportingToTheVue2(String idTraitement, String codefichier, Long statut, Long nbreTraite, Long nbtotal);
    
    void endGobalReportingToTheVue3(Long id, Long statut);
}