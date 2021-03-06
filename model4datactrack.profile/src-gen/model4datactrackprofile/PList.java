/**
 */
package model4datactrackprofile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PList</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.PList#getList <em>List</em>}</li>
 * </ul>
 *
 * @see model4datactrackprofile.Model4datactrackprofilePackage#getPList()
 * @model
 * @generated
 */
public interface PList extends EObject {
	/**
	 * Returns the value of the '<em><b>List</b></em>' reference list.
	 * The list contents are of type {@link model4datactrackprofile.Principal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' reference list.
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getPList_List()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Principal> getList();

} // PList
