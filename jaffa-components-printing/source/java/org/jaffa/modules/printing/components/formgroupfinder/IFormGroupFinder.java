// .//GEN-BEGIN:_1_be
/******************************************************
 * Code Generated From JAFFA Framework Default Pattern
 * 
 * The JAFFA Project can be found at http://jaffa.sourceforge.net
 * and is available under the Lesser GNU Public License
 ******************************************************/ 
package org.jaffa.modules.printing.components.formgroupfinder;

import org.jaffa.exceptions.ApplicationExceptions;
import org.jaffa.exceptions.FrameworkException;
import org.jaffa.modules.printing.components.formgroupfinder.dto.FormGroupFinderInDto;
import org.jaffa.modules.printing.components.formgroupfinder.dto.FormGroupFinderOutDto;
// .//GEN-END:_1_be
// Add additional imports//GEN-FIRST:_imports




// .//GEN-LAST:_imports
// .//GEN-BEGIN:_2_be
/** Interface for FormGroupFinder components.
 */
public interface IFormGroupFinder {

    /** Searches for FormGroup objects.
     * @param input The criteria based on which the search will be performed.
     * @throws ApplicationExceptions This will be thrown if the criteria contains invalid data.
     * @throws FrameworkException Indicates some system error
     * @return The search results.
     */    
    public FormGroupFinderOutDto find(FormGroupFinderInDto input) throws FrameworkException, ApplicationExceptions;
    
    /**
     * This should be invoked, when done with the component.
     */
    public void destroy();

    // .//GEN-END:_2_be
    // All the custom code goes here //GEN-FIRST:_custom






    // .//GEN-LAST:_custom
}
