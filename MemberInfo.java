
package clubmgmtstyst;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "member info", catalog = "clubmgmtst", schema = "")
@NamedQueries({
    @NamedQuery(name = "MemberInfo.findAll", query = "SELECT m FROM MemberInfo m")
    , @NamedQuery(name = "MemberInfo.findByMemberName", query = "SELECT m FROM MemberInfo m WHERE m.memberName = :memberName")
    , @NamedQuery(name = "MemberInfo.findByMemberid", query = "SELECT m FROM MemberInfo m WHERE m.memberid = :memberid")
    , @NamedQuery(name = "MemberInfo.findByPhno", query = "SELECT m FROM MemberInfo m WHERE m.phno = :phno")
    , @NamedQuery(name = "MemberInfo.findByClub", query = "SELECT m FROM MemberInfo m WHERE m.club = :club")})
public class MemberInfo implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "MEMBER NAME")
    private String memberName;
    @Id
    @Basic(optional = false)
    @Column(name = "MEMBERID")
    private Integer memberid;
    @Basic(optional = false)
    @Column(name = "phno")
    private String phno;
    @Basic(optional = false)
    @Column(name = "club")
    private String club;

    public MemberInfo() {
    }

    public MemberInfo(Integer memberid) {
        this.memberid = memberid;
    }

    public MemberInfo(Integer memberid, String memberName, String phno, String club) {
        this.memberid = memberid;
        this.memberName = memberName;
        this.phno = phno;
        this.club = club;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        String oldMemberName = this.memberName;
        this.memberName = memberName;
        changeSupport.firePropertyChange("memberName", oldMemberName, memberName);
    }

    public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        Integer oldMemberid = this.memberid;
        this.memberid = memberid;
        changeSupport.firePropertyChange("memberid", oldMemberid, memberid);
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        String oldPhno = this.phno;
        this.phno = phno;
        changeSupport.firePropertyChange("phno", oldPhno, phno);
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        String oldClub = this.club;
        this.club = club;
        changeSupport.firePropertyChange("club", oldClub, club);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (memberid != null ? memberid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MemberInfo)) {
            return false;
        }
        MemberInfo other = (MemberInfo) object;
        if ((this.memberid == null && other.memberid != null) || (this.memberid != null && !this.memberid.equals(other.memberid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "clubmgmtstyst.MemberInfo[ memberid=" + memberid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
