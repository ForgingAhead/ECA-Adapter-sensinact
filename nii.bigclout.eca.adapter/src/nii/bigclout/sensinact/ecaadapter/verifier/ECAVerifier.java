package nii.bigclout.sensinact.ecaadapter.verifier;

import java.io.InputStream;
import java.util.Collection;
import java.util.List;

import nii.bigclout.ecaadapter.dsl.RunTimeModel;

/**
 * This is the interface of the ECA Verifier which aims at identifying the conflicts among models
 * Once a conflict is identified, it should point out which two apps/rules are in conflict and ideally in particular,
 * it should point out which two conditions are in conflict!
 * @author Feng
 *
 */
public interface ECAVerifier {
	
	/**
	 * Providing the existing models are without conflicts. Now the specified model is newly added.
	 * the ECA verifier only needs to check this model against the existing models then.
	 * @param models
	 * @param model the specified, newly added/modified model
	 * @return a list of {@link Conflict} that has been identified.
	 */
	public List<Conflict> checkConflict(Collection<RunTimeModel> models, RunTimeModel model);
	
	/**
	 * Checking whether there are conflicts among the existing models.
	 * @return a list of {@link Conflict} that has been identified among the existing models.
	 */
	public List<Conflict> checkConflict(Collection<RunTimeModel> models);
	
	public List<Conflict> checkConflict(Collection<String> apps, String newApp, RunTimeModel model);

}
