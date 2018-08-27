/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infosystem;

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

/**
 *
 * @author MayankMS
 */
@Entity
@Table(name = "streams", catalog = "info", schema = "")
@NamedQueries({
    @NamedQuery(name = "Streams.findAll", query = "SELECT s FROM Streams s")
    , @NamedQuery(name = "Streams.findByStreamID", query = "SELECT s FROM Streams s WHERE s.streamID = :streamID")
    , @NamedQuery(name = "Streams.findByStreamType", query = "SELECT s FROM Streams s WHERE s.streamType = :streamType")
    , @NamedQuery(name = "Streams.findByStreamName", query = "SELECT s FROM Streams s WHERE s.streamName = :streamName")
    , @NamedQuery(name = "Streams.findByStreamDuration", query = "SELECT s FROM Streams s WHERE s.streamDuration = :streamDuration")
    , @NamedQuery(name = "Streams.findByStreamFees", query = "SELECT s FROM Streams s WHERE s.streamFees = :streamFees")
    , @NamedQuery(name = "Streams.findByStrEligibility", query = "SELECT s FROM Streams s WHERE s.strEligibility = :strEligibility")
    , @NamedQuery(name = "Streams.findBySeats", query = "SELECT s FROM Streams s WHERE s.seats = :seats")})
public class Streams implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "StreamID")
    private Integer streamID;
    @Column(name = "StreamType")
    private String streamType;
    @Column(name = "StreamName")
    private String streamName;
    @Column(name = "StreamDuration")
    private Integer streamDuration;
    @Column(name = "StreamFees")
    private Integer streamFees;
    @Column(name = "StrEligibility")
    private String strEligibility;
    @Column(name = "Seats")
    private Integer seats;

    public Streams() {
    }

    public Streams(Integer streamID) {
        this.streamID = streamID;
    }

    public Integer getStreamID() {
        return streamID;
    }

    public void setStreamID(Integer streamID) {
        Integer oldStreamID = this.streamID;
        this.streamID = streamID;
        changeSupport.firePropertyChange("streamID", oldStreamID, streamID);
    }

    public String getStreamType() {
        return streamType;
    }

    public void setStreamType(String streamType) {
        String oldStreamType = this.streamType;
        this.streamType = streamType;
        changeSupport.firePropertyChange("streamType", oldStreamType, streamType);
    }

    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        String oldStreamName = this.streamName;
        this.streamName = streamName;
        changeSupport.firePropertyChange("streamName", oldStreamName, streamName);
    }

    public Integer getStreamDuration() {
        return streamDuration;
    }

    public void setStreamDuration(Integer streamDuration) {
        Integer oldStreamDuration = this.streamDuration;
        this.streamDuration = streamDuration;
        changeSupport.firePropertyChange("streamDuration", oldStreamDuration, streamDuration);
    }

    public Integer getStreamFees() {
        return streamFees;
    }

    public void setStreamFees(Integer streamFees) {
        Integer oldStreamFees = this.streamFees;
        this.streamFees = streamFees;
        changeSupport.firePropertyChange("streamFees", oldStreamFees, streamFees);
    }

    public String getStrEligibility() {
        return strEligibility;
    }

    public void setStrEligibility(String strEligibility) {
        String oldStrEligibility = this.strEligibility;
        this.strEligibility = strEligibility;
        changeSupport.firePropertyChange("strEligibility", oldStrEligibility, strEligibility);
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        Integer oldSeats = this.seats;
        this.seats = seats;
        changeSupport.firePropertyChange("seats", oldSeats, seats);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (streamID != null ? streamID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Streams)) {
            return false;
        }
        Streams other = (Streams) object;
        if ((this.streamID == null && other.streamID != null) || (this.streamID != null && !this.streamID.equals(other.streamID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "infosystem.Streams[ streamID=" + streamID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
