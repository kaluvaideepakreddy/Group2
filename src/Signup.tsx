import {Button, Box, Typography, TextField } from "@mui/material";
import { Form, Formik} from "formik";
import {Field} from "formik";
import { object, string } from "yup";
import { useNavigate } from "react-router-dom";


const initalValues = {
    email: "",
    name: "",
    password: "",
};

const MaterialForm = () => {
    const navigate = useNavigate();
    return (
        <div className="MaterialForm">
            <Typography variant="h4">
                SIGNUP PAGE
            </Typography>
            <Formik
                initialValues={initalValues}
                validationSchema={object({
                    email: string().required("Please enter email").email("Invalid email"),
                    name: string().required("Please enter name").min(2, "Name too short"),
                    password: string()
                        .required("Please enter password")
                        .min(7, "Password should be minimum 7 characters long"),
                })}
                onSubmit={(values, formikHelpers) => {
                    console.log(values);
                    formikHelpers.resetForm();
                }}
            >
                {({ errors, isValid, touched, dirty }) => (
                    <Form>
                        <Field
                            name="email"
                            type="email"
                            as={TextField}
                            variant="outlined"
                            color="primary"
                            label="Email"
                            fullWidt
                            error={Boolean(errors.email) && Boolean(touched.email)}
                            helperText={Boolean(touched.email) && errors.email}
                        />
                        <Box height={14} />

                        <Field
                            name="name"
                            type="name"
                            as={TextField}
                            variant="outlined"
                            color="primary"
                            label="Name"

                            error={Boolean(errors.name) && Boolean(touched.name)}
                            helperText={Boolean(touched.name) && errors.name}
                        />
                        <Box height={14} />
                        <Field
                            name="password"
                            type="password"
                            as={TextField}
                            variant="outlined"
                            color="primary"
                            label="Password"

                            error={Boolean(errors.password) && Boolean(touched.password)}
                            helperText={Boolean(touched.password) && errors.password}
                        />
                        <Box height={14} />

                        <Button
                            onClick={()=> navigate('/')}
                            type="submit"
                            variant="contained"
                            color="primary"
                            size="large"
                            disabled={!isValid || !dirty}
                        >
                            Sign up
                        </Button>
                    </Form>
                )}
            </Formik>
        </div>
    );
};

export default MaterialForm;