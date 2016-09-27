/**
 * 
 */
package com.training.domain;

import java.util.HashMap;

import com.training.ifaces.TranslatorService;

/**
 * @author hgarg1
 *
 */
public class HindiTranslator implements TranslatorService {

  /* (non-Javadoc)
   * @see com.training.ifaces.TranslatorService#englishToHindi(java.lang.String)
   */
  HashMap<String, String> dictionary;
  public HindiTranslator(){
    super();
    
    dictionary = new HashMap<String, String>();
    
    dictionary.put("Banana", "Kela");
    dictionary.put("Rice", "Chawal");
    dictionary.put("Ten", "Dus");
    
  }
  @Override
  public String englishToHindi(String engWord) {
  // TODO Auto-generated method stub
  return dictionary.get(engWord);
  }

 
 

}
