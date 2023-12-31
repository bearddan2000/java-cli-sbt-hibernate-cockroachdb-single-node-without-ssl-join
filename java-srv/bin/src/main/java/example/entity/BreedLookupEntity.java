package example.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.OptimisticLockType;

@Entity
@Table(name = "breedLookup")
public class BreedLookupEntity {

  @Id
  @Column(unique = true, nullable = false)
  private Integer id;

  @Column(nullable = false, length = 100)
  private String breed;

  public BreedLookupEntity(int a, String b){ id=a; breed=b;}

  public Integer getId(){ return id;}
  public void setId(Integer value){id = value;}

  public String getBreed(){ return breed;}
  public void setBreed(String value){breed = value;}

  @Override
  public String toString(){
    return String.format("[OUTPUT] %d, breed=%s", id, breed);
  }
}
