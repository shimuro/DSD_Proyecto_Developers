/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.lacaja.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import org.apache.taglibs.standard.functions.Functions;
import pe.com.lacaja.connection.Conexion;
import pe.com.lacaja.model.Beneficiario;
import pe.com.lacaja.model.Boleta;
import pe.com.lacaja.model.Boleta_Detalle;

/**
 *
 * @author AlfredoRegis
 */
@WebService(endpointInterface = "pe.com.lacaja.service.LaCajaService")
public class LaCajaServiceImpl implements LaCajaService{

    Conexion con = new Conexion();
    Connection reg = con.conexion();
    String sql;

    @Override
    public boolean getUsuarioPorNroDoc(String nroDoc, String clave) {
        boolean value;
        
        sql = "select count(1) from PENSIONWEB.PPE_T_USUARIO where nrodoc=? and clave=?";
        value = false;
        
        try {
            PreparedStatement pst=reg.prepareStatement(sql);
            pst.setString(1, nroDoc);
            pst.setString(2, clave);
            ResultSet n=pst.executeQuery();
            n.first();
            if (n.getInt(1)>0){
                System.out.println("Entró bien! Registros:"+n.getInt(1));                
                value = true;
            }
        } catch (Exception e) {
                System.out.println("Error! "+e);                 
        }
        return value;
    }

    @Override
    public List<Beneficiario> getBeneficiario(String nroDoc) {
        List<Beneficiario> benef = new ArrayList<>();
        sql =   "select CODPER,APENOM, CODDOC, A.NRODOC, DOMICILIO \n" +
                "from PENSIONWEB.PPE_T_BENEFICIARIO A \n" +
                "inner join PENSIONWEB.PPE_T_USUARIO B on A.NroDoc = B.NroDoc\n" +
                "where B.NroDoc = ?";
                
        try {
            PreparedStatement pst=reg.prepareStatement(sql);
            pst.setString(1, nroDoc);            
            ResultSet n=pst.executeQuery();
            //n.first();
            
            while(n.next()){
                Beneficiario benef1 = new Beneficiario();
                benef1.setCODPER(n.getString("CODPER"));
                benef1.setAPENOM(n.getString("APENOM"));
                benef1.setCODDOC(n.getString("CODDOC"));
                benef1.setNRODOC(n.getString("NRODOC"));
                benef1.setDOMICILIO(n.getString("DOMICILIO"));
                benef.add(benef1);
            }
        } catch (Exception e) {
                System.out.println("Error! "+e);                 
        }
        return benef;
    }

    @Override
    public List<Boleta> getBoletas(String CodPer) {
        List<Boleta> boleta = new ArrayList<>();
        sql =   "select A.* from PENSIONWEB.PPE_T_BOLETA_CAB A\n" +
                "Where A.CODPER = ?";
                
        try {
            PreparedStatement pst=reg.prepareStatement(sql);
            pst.setString(1, CodPer);            
            ResultSet n=pst.executeQuery();
            //n.first();
            
            while(n.next()){
                Boleta boleta1 = new Boleta();
                boleta1.setPERANO(n.getInt("PERANO"));
                boleta1.setPERMES(n.getInt("PERMES"));
                boleta1.setFECGEN(Functions.substring(n.getString("FECGEN"),0,10));
                boleta1.setPLANA(n.getString("PLANA"));
                boleta1.setDESGRADBAJ(n.getString("DESGRADBAJ"));
                boleta1.setTOTREM(n.getDouble("TOTREM"));
                boleta1.setTOTDES(n.getDouble("TOTDES"));
                
                //Agrega el Detalle
                List<Boleta_Detalle> detalle = new ArrayList<>();
                sql =   "select A.* from PENSIONWEB.PPE_T_BOLETA_MOV A\n" +
                        "Where A.CODPER = ?";
                
                PreparedStatement pst1=reg.prepareStatement(sql);
                pst1.setString(1, CodPer);            
                ResultSet n1=pst1.executeQuery();
                while(n1.next()){
                    Boleta_Detalle detalle1 = new Boleta_Detalle();
                    detalle1.setTIPOMOV(n1.getString("TIPOMOV"));
                    detalle1.setCONCEPTO(n1.getString("CONCEPTO"));                    
                    detalle1.setDESCRI(n1.getString("DESCRI"));                    
                    detalle1.setIMPORTE(n1.getDouble("IMPORTE"));                    
                    
                    detalle.add(detalle1);
                }
                //Agregamos el Detalle
                boleta1.setDetalle(detalle);
                
                //Agrega Boleta y Detalle
                boleta.add(boleta1);
            }
        } catch (Exception e) {
                System.out.println("Error! "+e);                 
        }
        return boleta;
    }
    
}
