/**
 * generated by Xtext 2.13.0
 */
package nii.bigclout.ecaadapter.validation;

import com.google.common.base.Objects;
import nii.bigclout.ecaadapter.dsl.Action;
import nii.bigclout.ecaadapter.dsl.Resource;
import nii.bigclout.ecaadapter.dsl.Trigger;
import nii.bigclout.ecaadapter.validation.AbstractDslValidator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class DslValidator extends AbstractDslValidator {
  public final static String DUPLICATE_NAME = "duplicateName";
  
  /**
   * @Check
   * def checkGreetingStartsWithCapital(RunTimeModel model) {
   * if (!Character.isUpperCase(greeting.name.charAt(0))) {
   * warning('Name should start with a capital',
   * DslPackage.Literals.GREETING__NAME,
   * INVALID_NAME)
   * }
   * }
   */
  @Check
  public void checkTriggerStateIsValid(final Trigger trigger) {
    nii.bigclout.ecaadapter.dsl.State s = trigger.getState();
    Resource r = trigger.getResource();
    boolean flag = false;
    EList<nii.bigclout.ecaadapter.dsl.State> _states = r.getStates();
    for (final nii.bigclout.ecaadapter.dsl.State tmp : _states) {
      String _name = s.getName();
      String _name_1 = tmp.getName();
      boolean _equals = Objects.equal(_name, _name_1);
      if (_equals) {
        flag = true;
      }
    }
    if ((flag == false)) {
      String _name_2 = r.getName();
      String _plus = ("The state in the trigger is not valid for " + _name_2);
      String _plus_1 = (_plus + ".");
      this.error(_plus_1, null);
    }
  }
  
  @Check
  public void checkActionStateIsValid(final Action action) {
    nii.bigclout.ecaadapter.dsl.State s = action.getState();
    Resource r = action.getResource();
    boolean flag = false;
    EList<nii.bigclout.ecaadapter.dsl.State> _states = r.getStates();
    for (final nii.bigclout.ecaadapter.dsl.State tmp : _states) {
      String _name = s.getName();
      String _name_1 = tmp.getName();
      boolean _equals = Objects.equal(_name, _name_1);
      if (_equals) {
        flag = true;
      }
    }
    if ((flag == false)) {
      String _name_2 = r.getName();
      String _plus = ("The state is not valid for " + _name_2);
      String _plus_1 = (_plus + " in the action.");
      this.error(_plus_1, null);
    }
  }
}
