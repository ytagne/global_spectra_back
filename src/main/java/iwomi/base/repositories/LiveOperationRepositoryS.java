/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iwomi.base.repositories;

import iwomi.base.objects.LiveOperationS;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author fabri
 */
public interface LiveOperationRepositoryS extends JpaRepository <LiveOperationS, Long>{
    
         LiveOperationS findLiveOperationByCodeUnique(String codeUnique);
         LiveOperationS findOne(Long idope);

    
}